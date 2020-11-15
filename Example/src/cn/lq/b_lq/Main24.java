package cn.lq.b_lq;

/*把 2019 分解成 3 个各不相同的正整数之和，并且要求每个正整数都不包
含数字 2 和 4，一共有多少种不同的分解方法？
注意交换 3 个整数的顺序被视为同一种方法，例如 1000+1001+18 和
1001+1000+18 被视为同一种。*/
public class Main24 {
    public static void main(String[] args) throws InterruptedException {
        int n = 0;
        for (int i = 1; i < 2019; i++) {
            for (int j = 1; j < 2019; j++) {
                for (int k = 1; k < 2019; k++) {
                    if (i + j + k == 2019) {
                        if (i != j && j != k && k != i) {
                            if (String.valueOf(i).contains("2") || String.valueOf(i).contains("4")) {
                                continue;
                            }
                            if (String.valueOf(j).contains("2") || String.valueOf(j).contains("4")) {
                                continue;
                            }
                            if (String.valueOf(k).contains("2") || String.valueOf(k).contains("4")) {
                                continue;
                            }
                            n++;
                            System.out.println(i + " " + j + " " + k);
                        }
                    }
                }
            }
        }
        n = n / 6;
        System.out.println(n);
    }
}
