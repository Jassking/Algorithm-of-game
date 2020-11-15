package cn.ty.d_iofile;

import java.io.*;

//将e盘下面的某张图片，复制到当前项目下
public class IODemo03 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\23981\\Desktop\\picture1\\asdf.jpg");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        File desc=new File("src\\picture.jpg");
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            inputStream=new FileInputStream(file);
            outputStream=new FileOutputStream(desc);
            int len=-1;
            byte[] bytes=new byte[1024];
            while ((len=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (inputStream!=null)
                inputStream.close();
                if (outputStream!=null)
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
