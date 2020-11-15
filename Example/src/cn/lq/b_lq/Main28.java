package cn.lq.b_lq;
/*在1至2019中，有多少个数的数位中包含数字9？
　　注意，有的数中的数位中包含多个9，这个数只算一次。例如，1999这个数包含数字9，在计算只是算一个数。*/
public class Main28 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 2019; i++) {
            if (String.valueOf(i).contains("9")){
                sum++;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
