package cn.example.a_ex;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int n=scanner.nextInt();
        int[] number=new int[n];
        int[] num=new int[n];
        for (int o = 0; o < t; o++) {
            for (int i = 0; i < n; i++) {//ÖÃÁã
                num[i]=0;
            }
            for (int i = 0; i < n; i++) {
                number[i]=scanner.nextInt();
            }
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum=0;
                for (int j = i+1; j < number.length; j++) {
                    if (number[i]>=number[j]){
                        sum++;
                    }else {
                        break;
                    }
                    num[i]=sum;
                }
                if (i!=0) {
                    for (int j = i-1; j >= 0; j--) {
                        if (number[i] >= number[j]) {
                            sum++;
                        }else {
                            break;
                        }
                        num[i] = sum;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(num[i]+" ");
            }
        }
    }
}
