package cn.lq.a_lq;

public class Main12 {
    public static void main(String[] args) {
        for (int n = 100; n < 1000; n++) {
            int i=n%10;//个位
            int j=(n%100)/10;//十位
            int k=n/100;//百位
            if (i*i*i+j*j*j+k*k*k==n){
                System.out.println(n);
            }
        }
    }
}
