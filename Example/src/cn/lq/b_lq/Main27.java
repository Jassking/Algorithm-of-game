package cn.lq.b_lq;

import java.util.Scanner;
/*�ڼ�����洢�У�15.125GB�Ƕ���MB��*/
/*1GB=1024MB=1,073,741,824B*/
public class Main27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double n=scanner.nextDouble();
        int a=1024;
        double sum=0;
        sum= a*n;
        System.out.println(sum);
    }
}
