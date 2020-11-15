package cn.ty.d_iofile;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/*
判断某个目录下是否含有后缀名为.jgp的文件，如果有，就输出此文件的名称
 */
public class JpgExample {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\23981\\Desktop\\杂物文档\\图片");
        //方法一
        String[] list= file.list();
        String string = Arrays.toString(list);
        System.out.println(string);
        //方法二
        File[] listFiles=file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //dir - 在其中找到文件的目录。
                //name - 文件的名称。
                return name.endsWith(".jpg");//endsWith以什么结尾
            }
        });
        System.out.println(Arrays.toString(listFiles));

        System.out.println(".......................");

        File[] files=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //pathname当前要过滤的这个文件的对象表示
                return pathname.getName().endsWith(".jpg")&&(pathname.length()>200*1024)&&(!pathname.isHidden());
                //pathname.getName().endsWith(".jpg")获取以.jpg结尾的文件名
                //pathname.length()文件大小
                //pathname.isHidden()表示为隐藏文件
            }
        });
        System.out.println(Arrays.toString(files));
    }
}
