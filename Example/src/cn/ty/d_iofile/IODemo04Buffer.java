package cn.ty.d_iofile;

import java.io.*;

//使用Buffer缓冲流，将e盘下面的某个视频，复制到当前项目下
public class IODemo04Buffer {
    public static void main(String[] args) {
        File file = new File("\\迅雷下载\\大佛普拉斯.BD.720p.中英双字幕.mkv");
        File desc = new File("src\\picture.mkv");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(desc);
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            int len = -1;
            byte[] bytes = new byte[1024];
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedInputStream != null)
                    bufferedInputStream.close();
                if (bufferedOutputStream!=null)
                    bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


