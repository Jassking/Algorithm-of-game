package cn.lq.b_lq;

/*给定数列 1, 1, 1, 3, 5, 9, 17, …，从第 4 项开始，每项都是前 3 项的和。求
第 20190324 项的最后 4 位数字。*/
public class Main23 {
    public static void main(String[] args) {
        int[] a=new int[20190324];
        for (int i = 0; i < 20190324; i++) {
            a[0]=1;
            a[1]=1;
            a[2]=1;
            if (i>2){
                a[i]=(a[i-1]+a[i-2]+a[i-3])%10000;//保留最后四位数字
            }
        }
        System.out.println(a[20190323]);
    }
}
