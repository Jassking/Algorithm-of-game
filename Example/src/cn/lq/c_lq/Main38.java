package cn.lq.c_lq;

import java.util.Scanner;

public class Main38 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).contains("2")||String.valueOf(i).contains("0")||String.valueOf(i).contains("1")||String.valueOf(i).contains("9")){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
