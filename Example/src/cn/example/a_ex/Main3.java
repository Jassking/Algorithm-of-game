package cn.example.a_ex;

import java.util.Scanner;

/* 在vivo产线上，每位职工随着对手机加工流程认识的熟悉和经验的增加，日产量也会不断攀升。
假设第一天量产1台，接下来2天(即第二、三天)每天量产2件，接下来3天(即第四、五、六天)每天量产3件 ... ...
以此类推，请编程计算出第n天总共可以量产的手机数量。 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        int temp=0;
        for (int i = 1; i <= n; i++) {
            if (i==1){
                temp=i;
                n-=1;
            }else {
                sum=i*i;
                n-=i;
            }
            temp+=sum;
        }
        int sqrt =(int) Math.sqrt(sum)+1;
        sum=n*sqrt;
        temp+=sum;
        System.out.println(temp);
    }
}
