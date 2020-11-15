package cn.example.c_lk.a;
/*两数之和
给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是 0 到 n-1。
样例
Example1:
给出 numbers = [2, 7, 11, 15], target = 9, 返回 [0, 1].
Example2:
给出 numbers = [15, 2, 7, 11], target = 9, 返回 [1, 2].
挑战
Either of the following solutions are acceptable:
    O(n) Space, O(nlogn) Time
    O(n) Space, O(n) Time
注意事项
你可以假设只有一组答案。
*/
public class Main4 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] num=new int[2];
        if (numbers.length==0){
            return num;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target){
                    num[0]=i;
                    num[1]=j;
                }
            }
        }
        return num;
    }
}
