package cn.example.c_lk.a;

import java.util.ArrayList;
import java.util.List;
/*9. Fizz Buzz ����
����һ������n. �� 1 �� n ��������Ĺ����ӡÿ������
    ����������3��������ӡfizz.
    ����������5��������ӡbuzz.
    ����������ͬʱ��3��5��������ӡfizz buzz.
    ���������Ȳ��ܱ� 3 ����Ҳ���ܱ� 5 ��������ӡ���ֱ���
����
���� n = 15, ����һ���ַ������飺
[
  "1", "2", "fizz",
  "4", "buzz", "fizz",
  "7", "8", "fizz",
  "buzz", "11", "fizz",
  "13", "14", "fizz buzz"
]
��ս
���Ƿ����ֻ��һ�� if ��ʵ��
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
