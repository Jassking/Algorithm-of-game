package cn.lq.c_lq;

/*第四题：数的分解
把 2019 分解成 3 个各不相同的正整数之和，并且要求每个正整数都不包 含数字 2 和 4，一共有多少种不同的分解方法？
注意交换 3 个整数的顺序被视为同一种方法，例如 1000+1001+18 和 1001+1000+18 被视为同一种。
【答案提交】
这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。*/
//答案：40785
public class Main37 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 2019; i++) {
            if (String.valueOf(i).contains("2") || String.valueOf(i).contains("4")) {
                continue;
            }
            for (int j = 1; j < 2019; j++) {
                if (String.valueOf(j).contains("2") || String.valueOf(j).contains("4")) {
                    continue;
                }
                for (int k = 1; k < 2019; k++) {
                    if (String.valueOf(k).contains("2") || String.valueOf(k).contains("4")) {
                        continue;
                    }
                    if (i + j + k == 2019) {
                        if (i != j && j != k && k != i) {
                            sum++;
                            System.out.println(i+" "+j+" "+k);
                        }
                    }
                }
            }
        }
        sum /= 6;
        System.out.println(sum);
    }
}
