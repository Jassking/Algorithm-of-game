package cn.example.c_lk.a;

import java.util.HashSet;
import java.util.Set;
/*202. 快乐数

编写一个算法来判断一个数 n 是不是快乐数。

「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。

如果 n 是快乐数就返回 True ；不是，则返回 False 。



示例：

输入：19
输出：true
解释：
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

*/
public class Main24 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        if (n==1){
            return true;
        }
        set.add(n);
        int sum=0;//每次求得平方的和
        int num = 0;
        while (sum!=1){
            sum=0;
            while (n!=0){
                num = n%10;//求个位的数字
                n/=10;//每次把个位的数字去除
                sum+=num*num;//平方和
            }
            if (set.contains(sum)){//判断是否存在相同的数，若存在则是无限循环
                return false;
            }else {
                set.add(sum);
            }
            n=sum;
        }
        return true;
    }
}
