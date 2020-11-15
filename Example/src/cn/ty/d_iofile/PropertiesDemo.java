package cn.ty.d_iofile;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        //1.配置文件的读取【常用】
        Properties properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream("src\\cn\\ty\\IOFile\\config.properties");
        //你只要给他一个properties文件的输入流，它就会自动加载配置信息到properties中
        properties.load(fileInputStream);//把properties文件加载到properties中
        System.out.println(properties.getProperty("prods.ds.ip"));
        System.out.println(properties.getProperty("prods.ds1.ip"));
        System.out.println(properties.getProperty("prods.ds2.ip","127.168.1.12"));

        System.out.println("///////////////////////////");

        //2.配置文件的写入
        //对配置文件进行修改（只能增加配置文件的数据，不能对原来的数据进行修改）
        properties.setProperty("prod.ds3.ip","192.1686.0.1");
        properties.setProperty("prod.ds.ip","1");
        //把修改好的配置文件加载到新的properties文件中（不能把修改好的配置存储到原来的properties文件中）
        properties.store(new FileWriter("zzz.properties"),"新的配置文件");

    }
}
