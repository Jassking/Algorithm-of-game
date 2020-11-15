package cn.lq.c_lq;

import java.util.Scanner;
/*问题描述
　　给定一个单词，请使用凯撒密码将这个单词加密。
　　凯撒密码是一种替换加密的技术，单词中的所有字母都在字母表上向后偏移3位后被替换成密文。即a变为d，b变为e，...，w变为z，x变为a，y变为b，z变为c。
　　例如，lanqiao会变成odqtldr。
输入格式
　　输入一行，包含一个单词，单词中只包含小写英文字母。
输出格式
　　输出一行，表示加密后的密文。
样例输入
lanqiao
样例输出
odqtldr
评测用例规模与约定
　　对于所有评测用例，单词中的字母个数不超过100。*/
public class Main41 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c=='a'){
                stringBuilder.append("d");
            }else if (c=='b'){
                stringBuilder.append("e");
            }else if (c=='c'){
                stringBuilder.append("f");
            }else if (c=='d'){
                stringBuilder.append("g");
            }else if (c=='e'){
                stringBuilder.append("h");
            }else if (c=='f'){
                stringBuilder.append("i");
            }else if (c=='g'){
                stringBuilder.append("j");
            }else if (c=='h'){
                stringBuilder.append("k");
            }else if (c=='i'){
                stringBuilder.append("l");
            }else if (c=='j'){
                stringBuilder.append("m");
            }else if (c=='k'){
                stringBuilder.append("n");
            }else if (c=='l'){
                stringBuilder.append("o");
            }else if (c=='m'){
                stringBuilder.append("p");
            }else if (c=='n'){
                stringBuilder.append("q");
            }else if (c=='o'){
                stringBuilder.append("r");
            }else if (c=='p'){
                stringBuilder.append("s");
            }else if (c=='q'){
                stringBuilder.append("t");
            }else if (c=='r'){
                stringBuilder.append("u");
            }else if (c=='s'){
                stringBuilder.append("v");
            }else if (c=='t'){
                stringBuilder.append("w");
            }else if (c=='u'){
                stringBuilder.append("x");
            }else if (c=='v'){
                stringBuilder.append("y");
            }else if (c=='w'){
                stringBuilder.append("z");
            }else if (c=='x'){
                stringBuilder.append("a");
            }else if (c=='y'){
                stringBuilder.append("b");
            }else if (c=='z'){
                stringBuilder.append("c");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
