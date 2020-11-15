package cn.lq.c_lq;
/*第八题：人物相关性分析
小明正在分析一本小说中的人物相关性。他想知道在小说中 Alice 和 Bob 有多少次同时出现。
更准确的说，小明定义 Alice 和 Bob“同时出现”的意思是：在小说文本 中 Alice 和 Bob 之间不超过 K 个字符。
例如以下文本：
ThisisastoryaboutAliceandBob.AlicewantstosendaprivatemessagetoBob.
假设 K = 20，则 Alice 和 Bob 同时出现了 2 次，分别是”Alice and Bob” 和”Bob. Alice”。
前者 Alice 和 Bob 之间有 5 个字符，后者有 2 个字符。
注意:
1. Alice 和 Bob 是大小写敏感的，alice 或 bob 等并不计算在内。
2. Alice 和 Bob 应为单独的单词，前后可以有标点符号和空格，但是不能 有字母。例如 Bobbi 並不算出现了 Bob
【输入格式】
第一行包含一个整数 K。
第二行包含一行字符串，只包含大小写字母、标点符号和空格。长度不超 过 1000000。
【输出格式】
 输出一个整数，表示 Alice 和 Bob 同时出现的次数。
【样例输入】
20
ThisisastoryaboutAliceandBob.AlicewantstosendaprivatemessagetoBob.
【样例输出】
2
【评测用例规模与约定】
 对于所有评测用例，1≤ K ≤1000000。
时间限制：1.0s
内存限制：512.0MB*/
import java.util.Scanner;

public class Main39 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=scanner.nextLine();
        String[] w=s.split("\\s+|\\.");//使用正则表达式将字符串分割成字符数组
        int ans=0;
        //\\s表示   空格,回车,换行等空白符,
        // +号表示一个或多个的意思
        //|表示或者
        //\\.表示.
        //split("\\s+|\\.");遇到空格,回车,换行等空白符,或者.时，进行分割
        for (int i = 0; i < w.length; i++) {
            if (w[i].contains("Alice")){
                for (int j = i+1; j < w.length; j++) {
                    if (w[j].contains("Bob")){
                        int sum=0;
                        for (int k =i+1; k <j ; k++) {//计算Alice 和 Bob 之间有几个字符
                            sum+=w[k].length();
                        }
                        if (sum<n){//判断Alice 和 Bob 之间不超过 K 个字符
                            ans++;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < w.length; i++) {
            if (w[i].contains("Bob")){
                for (int j = i+1; j < w.length; j++) {
                    if (w[j].contains("Alice")){
                        int sum=0;
                        for (int k =i+1; k <j ; k++) {
                            sum+=w[k].length();
                        }
                        if (sum<n){
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
