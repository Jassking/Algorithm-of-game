package cn.ty.d_iofile;

import java.io.*;

//1. 将当前项目下的a.txt文件的内容，复制道当前项目下的b.txt中。
public class IODemo01 {
    public static void main(String[] args) {
        File file=new File("src\\a.txt");
        File desc=new File("src\\b.txt");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(desc);
            int len=-1;
            byte[] bytes=new byte[10];
            while ((len=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) inputStream.close();
                if (outputStream != null) outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
