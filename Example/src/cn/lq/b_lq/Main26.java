package cn.lq.b_lq;

import java.util.Scanner;

/*1200000有多少个约数（只计算正约数）。*/
/*答案提交
　　这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。*/
public class Main26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        for (int i = 1; i <= 1200000; i++) {
            if (n%i==0){
                System.out.println(i);
                sum++;
            }
        }
        System.out.println(sum);
    }
}
