package cn.sf.a_sf;

import java.util.Scanner;

public class Demo2 {
    /*��һ���ַ����е�ÿ���ո��滻�ɡ�%20����
    ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��*/
    //����һ��������
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
    //����2����Ŀ����� a == b ?c:d
    /*���ж�a==b�Ƿ�Ϊ�棬��Ϊ�棬����Ϊc ; ���򣬽��Ϊd��*/
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
        /*���Ϊ
        we are happy
        we%20are%20happy
        */
    }
}
