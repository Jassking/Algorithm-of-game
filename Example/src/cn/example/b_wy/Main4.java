package cn.example.b_wy;

import java.util.Scanner;

/*Ϊ�˵õ�һ������"�෴��",���ǽ������������˳��ߵ�,Ȼ���ټ���ԭ�ȵ����õ�"�෴��"��
����,Ϊ�˵õ�1325��"�෴��",�������ǽ�����������˳��ߵ�,���ǵõ�5231,֮���ټ���ԭ�ȵ���,���ǵõ�5231+1325=6556.
����ߵ�֮���������ǰ׺��,ǰ׺�㽫�ᱻ���ԡ�����n = 100, �ߵ�֮����1.*/
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        StringBuffer stringBuffer=new StringBuffer(s);
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(Integer.parseInt(reverse.toString())+Integer.parseInt(s));
    }
}
