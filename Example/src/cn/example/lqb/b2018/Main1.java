package cn.example.lqb.b2018;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

/*�����⣺������

��iΪ������λ����������������n��(2+3i)^n ��ʵ�����鲿����������
�� (2+3i)^123456 ���ڶ��٣� ��(2+3i)��123456���ݣ�������ֺܴ�Ҫ��ȷ��ʾ��

��д�� "ʵ�����鲿i" ����ʽ��ʵ�����鲿���������������ÿ�ѧ��������ʾ����
�м��κεط������ӿո�ʵ��Ϊ��ʱǰ�治�����š�(2+3i)^2 д��: -5+12i��
(2+3i)^5 ��д��: 122-597i*/
public class Main1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream(new FileOutputStream("work.txt"));
        System.setOut(ps);  //�ļ����
        int n=123456;
        BigInteger a=new BigInteger("2");
        BigInteger b=new BigInteger("3");
        BigInteger a1=new BigInteger("2");
        BigInteger b1=new BigInteger("3");
        for(int i=1;i<n;i++) {
            BigInteger ta=a;
            a=a.multiply(a1).subtract(b.multiply(b1));//a=a*a1-b*b1;
            b=ta.multiply(b1).add(b.multiply(a1));//b=a*b1+b*a1
        }
        System.out.println(a+(b.compareTo(BigInteger.ZERO)>0?"+":"")+b+"i");
    }
}
