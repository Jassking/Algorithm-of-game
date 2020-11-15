package cn.ty.d_iofile;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        //1.�����ļ��Ķ�ȡ�����á�
        Properties properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream("src\\cn\\ty\\IOFile\\config.properties");
        //��ֻҪ����һ��properties�ļ��������������ͻ��Զ�����������Ϣ��properties��
        properties.load(fileInputStream);//��properties�ļ����ص�properties��
        System.out.println(properties.getProperty("prods.ds.ip"));
        System.out.println(properties.getProperty("prods.ds1.ip"));
        System.out.println(properties.getProperty("prods.ds2.ip","127.168.1.12"));

        System.out.println("///////////////////////////");

        //2.�����ļ���д��
        //�������ļ������޸ģ�ֻ�����������ļ������ݣ����ܶ�ԭ�������ݽ����޸ģ�
        properties.setProperty("prod.ds3.ip","192.1686.0.1");
        properties.setProperty("prod.ds.ip","1");
        //���޸ĺõ������ļ����ص��µ�properties�ļ��У����ܰ��޸ĺõ����ô洢��ԭ����properties�ļ��У�
        properties.store(new FileWriter("zzz.properties"),"�µ������ļ�");

    }
}
