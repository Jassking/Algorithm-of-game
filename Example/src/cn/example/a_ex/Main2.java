package cn.example.a_ex;
/*vivo2020届春季校园招聘在线编程考试*/
/*现给定任意正整数 n，请寻找并输出最小的正整数 m（m>9），使得 m 的各位（个位、十位、百位 ... ...）之乘积等于n，
若不存在则输出 -1。
输入例子1:
36
输出例子1:
49
输入例子2:
100
输出例子2:
455
*/
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();   //获取开始时间
        doSomeThing();  //测试的代码段
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"s");
    }

    private static int doSomeThing() {
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        int solution = solution(s);
        System.out.println(solution);
        return s;
    }

    public static int solution(int n) {
        List<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder append=null;
        if (n < 10){
            return 10 + n;
        }
        while (n >= 10){
            for (int i = 9; i >= 2; i--) {
                if (0 == n % i){
                    list.add(i);
                    n = n / i;
                    break;
                }
                if (2 == i) return -1;
            }
        }
        list.add(n);
        for (int i = 0; i < list.size(); i++) {
            append = stringBuilder.append(list.get(i));
        }
        return Integer.parseInt(append.reverse().toString());
    }
}