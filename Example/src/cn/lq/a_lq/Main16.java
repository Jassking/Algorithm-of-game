package cn.lq.a_lq;

import java.math.BigInteger;
import java.util.Scanner;

/*从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。*/
public class Main16 {
    public static void main(String[] args) {
        //方法1
        /*Scanner scanner=new Scanner(System.in);
        String n=scanner.next();
        BigInteger bigInteger=new BigInteger(n,16);
        System.out.print(bigInteger.toString()+"");
        //方法3  int num=Integer.parseInt(i,16);//将十六进制转换为十进制
        System.out.print(num+"");
        */

        //方法2
        Scanner scanner=new Scanner(System.in);
        String n=scanner.next();
        char[] chars=n.toCharArray();//转换成字符数组
        long sum=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='A'){
                //Math.pow(底数,指数);
                sum+=10*Math.pow(16,chars.length-i-1);
            }else if (chars[i]=='B'){
                sum+=11*Math.pow(16,chars.length-i-1);
            }else if (chars[i]=='C'){
                sum+=12*Math.pow(16,chars.length-i-1);
            }else if (chars[i]=='D'){
                sum+=13*Math.pow(16,chars.length-i-1);
            }else if (chars[i]=='E'){
                sum+=14*Math.pow(16,chars.length-i-1);
            }else if (chars[i]=='F'){
                sum+=15*Math.pow(16,chars.length-i-1);
            }else{
                //(int)chars[i]-48;通过ASCLL码将字符转换为int型，ASCLL码为48表示为字符0
                sum+=((int)chars[i]-48)*Math.pow(16,chars.length-i-1);
            }
        }
        System.out.println(sum);
    }
}
