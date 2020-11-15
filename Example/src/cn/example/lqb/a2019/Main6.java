package cn.example.lqb.a2019;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
8.人物相关性分析：

    【问题描述】
    小明正在分析一本小说中的人物相关性。他想知道在小说中Alice 和Bob
    有多少次同时出现。
    更准确的说，小明定义Alice 和Bob“同时出现”的意思是：在小说文本
    中Alice 和Bob 之间不超过K 个字符。
    例如以下文本：
    This is a story about Alice and Bob. Alice wants to send a private message to Bob.
    假设K = 20，则Alice 和Bob 同时出现了2 次，分别是”Alice and Bob”
    和”Bob. Alice”。前者Alice 和Bob 之间有5 个字符，后者有2 个字符。
    注意:

    Alice 和Bob 是大小写敏感的，alice 或bob 等并不计算在内。

    Alice 和Bob 应为单独的单词，前后可以有标点符号和空格，但是不能
    有字母。例如Bobbi 並不算出现了Bob。

    【输入格式】
    第一行包含一个整数K。
    第二行包含一行字符串，只包含大小写字母、标点符号和空格。长度不超
    过1000000。
    【输出格式】
    输出一个整数，表示Alice 和Bob 同时出现的次数。
    【样例输入】

    20
    This is a story about Alice and Bob. Alice wants to send a private message to Bob.

    【样例输出】
    2
*/
public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int K = input.nextInt();
            input.nextLine();
            String text = input.nextLine();
            //字符串分割，按照空格和.分割字符，若是（.空格）分割后为空字符串。
            String[] words = text.split("\\s+|\\.");
            int[] wordsLength = new int[words.length];
            //将分割的字符串的长度值存储，避免三重循环中调用String.length();
            for (int i = 0; i < words.length; i++) {
                wordsLength[i] = words[i].length();
            }
            int num = 0;
            //Alice ——> Bob的距离
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals("Alice")) {
                    for (int j = i + 1; j < words.length; j++) {
                        int sum = 1;
                        if (words[j].equals("Bob")) {
                            for (int k = i + 1; k < j; k++) {
                                //每个单词的长度加空格占据的长度
                                sum += wordsLength[k] + 1;
                            }
                            if (sum <= K) {
                                num++;
                            }
                        }
                    }
                }
            }
            //Bob ——> Alice的距离
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals("Bob")) {
                    for (int j = i + 1; j < words.length; j++) {
                        int sum = 1;
                        if (words[j].equals("Alice")) {
                            for (int k = i + 1; k < j; k++) {
                                sum += wordsLength[k] + 1;
                            }
                            if (sum <= K) {
                                num++;
                            }
                        }
                    }
                }
            }
            System.out.println(num);
        } catch (Exception e) {
            input.close();
        }
    }
}
