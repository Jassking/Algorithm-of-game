package cn.example.c_zj;

public class Main7 {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(a));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        int stats = 0;
        int end=2;
        int top=0;
        for (int i = 1; i <= arr.length; i++) {
            stats = i + end;
            if (stats <= arr.length) {
                for (int j = top; j < stats; j++) {
                    sum += arr[j];
                }
                System.out.println(sum);
                top += 1;
            }else{
                i=0;
                if (end==2){
                    end=4;
                    continue;
                }
                if (end==4){
                    end=6;
                    continue;
                }
                if (end==6){
                    end=8;
                    continue;
                }
                if (end==8){
                    break;
                }
            }
        }
        return sum;
    }
}
