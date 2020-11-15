package cn.ty.d_iofile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args)  {
        OutputStream out= null;
        try {
            out = new FileOutputStream("E:\\a.txt",true);
            out.write("fjhdadasfasdf".getBytes());//"fjh".getBytes()字符串对应的字节数组
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (out!=null)
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
