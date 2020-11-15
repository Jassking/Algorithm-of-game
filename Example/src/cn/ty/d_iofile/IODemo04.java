package cn.ty.d_iofile;

import java.io.*;

//将e盘下面的某个视频，复制到当前项目下
public class IODemo04 {
    public static void main(String[] args) {
        File file=new File("\\迅雷下载\\大佛普拉斯.BD.720p.中英双字幕.mkv");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        File desc=new File("src\\picture.mkv");
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
