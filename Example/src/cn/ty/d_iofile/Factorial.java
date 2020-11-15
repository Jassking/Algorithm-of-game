package cn.ty.d_iofile;
//计算5的阶乘,递归版
public class Factorial {
    public static void main(String[] args) {
        System.out.println(print(5));
    }
    public static int print(int n){
        if (n==1){//判断是否是最后一个数，若是，则跳出递归循环
            return 1;
        }
        return print(n-1)*n;
    }
}
