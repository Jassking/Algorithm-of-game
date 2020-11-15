package cn.example.c_lk.a;

import java.util.ArrayList;
import java.util.List;
/*9. Fizz Buzz 问题
给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：
    如果这个数被3整除，打印fizz.
    如果这个数被5整除，打印buzz.
    如果这个数能同时被3和5整除，打印fizz buzz.
    如果这个数既不能被 3 整除也不能被 5 整除，打印数字本身。
样例
比如 n = 15, 返回一个字符串数组：
[
  "1", "2", "fizz",
  "4", "buzz", "fizz",
  "7", "8", "fizz",
  "buzz", "11", "fizz",
  "13", "14", "fizz buzz"
]
挑战
你是否可以只用一个 if 来实现
*/
public class Main9 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("fizz buzz");
            } else if (i % 3 == 0) {
                list.add("fizz");
            } else if (i % 5 == 0) {
                list.add("buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
