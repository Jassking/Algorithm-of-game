package cn.lq.a_lq;

public class Main12 {
    public static void main(String[] args) {
        for (int n = 100; n < 1000; n++) {
            int i=n%10;//��λ
            int j=(n%100)/10;//ʮλ
            int k=n/100;//��λ
            if (i*i*i+j*j*j+k*k*k==n){
                System.out.println(n);
            }
        }
    }
}
