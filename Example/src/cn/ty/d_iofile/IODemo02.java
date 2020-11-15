package cn.ty.d_iofile;

import java.io.*;

//将c:\a.txt内容复制道d:\b.txt中
public class IODemo02 {
    public static void main(String[] args) {
        File file = new File("src\\a.txt");
        File desc = new File("d:\\b.txt");
        InputStream inputStream = null;//读取
        OutputStream outputStream = null;//写入
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(desc);
            int len=-1;
            byte[] bytes=new byte[10];
            while((len=inputStream.read(bytes))!=-1){
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
