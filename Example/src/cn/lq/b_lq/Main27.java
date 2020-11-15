package cn.lq.b_lq;

import java.util.Scanner;
/*在计算机存储中，15.125GB是多少MB？*/
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
