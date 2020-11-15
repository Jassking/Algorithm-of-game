package cn.sf.a_sf;

import java.util.Scanner;

public class Demo2 {
    /*将一个字符串中的每个空格替换成“%20”。
    例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。*/
    //方法一：暴力法
    public static String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer=new StringBuffer();
        String ans ="%20";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' '){
                stringBuffer.append(ans);
            }else{
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
    //方法2：三目运算符 a == b ?c:d
    /*先判断a==b是否为真，若为真，则结果为c ; 否则，结果为d。*/
    /*public static String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer = new StringBuffer();
        String ans = "%20";
        for (int i = 0; i < str.length(); i++) {
            stringBuffer.append(str.charAt(i) == ' ' ? ans : str.charAt(i));
        }
        return stringBuffer.toString();
    }*/

    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        stringBuffer.append(string);
        System.out.println(replaceSpace(stringBuffer));
        /*结果为
        we are happy
        we%20are%20happy
        */
    }
}
