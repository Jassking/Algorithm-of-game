package cn.ty.d_iofile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        InputStream in=null;
        try {
            in= new FileInputStream("e:\\a.txt");
            //创建一个用来接受内容的字节数组
            byte[] bytes=new byte[10];
            int flag=-1;
            //read方法执行结果为-1时，表示文件中的数据被读取完毕
            while ((flag=in.read(bytes))!=-1){
                //String方法，把字节数组转化为字符数组
                //new String(bytes,0,flag)参数1：传入一个字节数组；参数2：从第几个字节开始；参数3：到第几个字节结束
                System.out.print(new String(bytes,0,flag));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (in!=null)//防止输入流没有创建成功
                in.close();//关闭输入流占用的系统空间
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
