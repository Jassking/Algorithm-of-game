package cn.lq.a_lq;

import java.math.BigInteger;
import java.util.Scanner;

/*�Ӽ�������һ��������8λ������ʮ���������ַ���������ת��Ϊ����ʮ�������������
����ע��ʮ���������е�10~15�ֱ��ô�д��Ӣ����ĸA��B��C��D��E��F��ʾ��*/
public class Main16 {
    public static void main(String[] args) {
        //����1
        /*Scanner scanner=new Scanner(System.in);
        String n=scanner.next();
        BigInteger bigInteger=new BigInteger(n,16);
        System.out.print(bigInteger.toString()+"");
        //����3  int num=Integer.parseInt(i,16);//��ʮ������ת��Ϊʮ����
        System.out.print(num+"");
        */

        //����2
        Scanner scanner=new Scanner(System.in);
        String n=scanner.next();
        char[] chars=n.toCharArray();//ת�����ַ�����
        long sum=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='A'){
                //Math.pow(����,ָ��);
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
                //(int)chars[i]-48;ͨ��ASCLL�뽫�ַ�ת��Ϊint�ͣ�ASCLL��Ϊ48��ʾΪ�ַ�0
                sum+=((int)chars[i]-48)*Math.pow(16,chars.length-i-1);
            }
        }
        System.out.println(sum);
    }
}
