package cn.example.c_lk.b;

import java.math.BigInteger;
/*
쳲�������������F= F2=1����F3��ʼ��F��= Fn-1+Fn-2���������
GCD(F2020��F520)������GCD(A,B)��ʾA��B�����Լ����
 */
public class Main38 {
    public static void main(String[] args) {
        BigInteger b=sum(2020);
        BigInteger a=sum(520);
        System.out.println(b);
        System.out.println(a);
        BigInteger ans=new BigInteger("0");
        while(!b.equals(ans)) {//���Լ��
            BigInteger i=a.remainder(b);
            a=b;
            b=i;
        }
        System.out.println("==========="+a);
    }
    public static BigInteger sum(int i){
        BigInteger c=new BigInteger("0");
        BigInteger a=new BigInteger("1");
        BigInteger b=new BigInteger("1");
        for (int j = 3; j <= i; j++) {
            c=a.add(b);
            a=b;
            b=c;
        }
        return c;
    }
}
