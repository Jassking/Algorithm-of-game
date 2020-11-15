package cn.lq.c_lq;
/*第三题：数列求值
给定数列 1, 1, 1, 3, 5, 9, 17, …，从第 4 项开始，每项都是前 3 项的和。求第20190324项的最后4位数字。
【答案提交】
这是一道结果填空的题，你只需要算出结果后提交即可。
本题的结果为一个4位整数（提示：答案的千位不为 0），在提交答案时只填写这个整数，填写多余的内容将无法得分。*/
/*答案：4659*/
public class Main36 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        int k=1;
        int sum=0;
        for (int l = 3; l < 20190324; l++) {
            sum=i+j+k;
            sum%=10000;
            k=j;
            j=i;
            i=sum;
        }
        System.out.println(sum);
    }
}
