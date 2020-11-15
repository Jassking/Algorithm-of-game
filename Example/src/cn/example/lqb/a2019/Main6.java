package cn.example.lqb.a2019;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
8.��������Է�����

    ������������
    С�����ڷ���һ��С˵�е���������ԡ�����֪����С˵��Alice ��Bob
    �ж��ٴ�ͬʱ���֡�
    ��׼ȷ��˵��С������Alice ��Bob��ͬʱ���֡�����˼�ǣ���С˵�ı�
    ��Alice ��Bob ֮�䲻����K ���ַ���
    ���������ı���
    This is a story about Alice and Bob. Alice wants to send a private message to Bob.
    ����K = 20����Alice ��Bob ͬʱ������2 �Σ��ֱ��ǡ�Alice and Bob��
    �͡�Bob. Alice����ǰ��Alice ��Bob ֮����5 ���ַ���������2 ���ַ���
    ע��:

    Alice ��Bob �Ǵ�Сд���еģ�alice ��bob �Ȳ����������ڡ�

    Alice ��Bob ӦΪ�����ĵ��ʣ�ǰ������б����źͿո񣬵��ǲ���
    ����ĸ������Bobbi �K���������Bob��

    �������ʽ��
    ��һ�а���һ������K��
    �ڶ��а���һ���ַ�����ֻ������Сд��ĸ�������źͿո񡣳��Ȳ���
    ��1000000��
    �������ʽ��
    ���һ����������ʾAlice ��Bob ͬʱ���ֵĴ�����
    ���������롿

    20
    This is a story about Alice and Bob. Alice wants to send a private message to Bob.

    �����������
    2
*/
public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int K = input.nextInt();
            input.nextLine();
            String text = input.nextLine();
            //�ַ����ָ���տո��.�ָ��ַ������ǣ�.�ո񣩷ָ��Ϊ���ַ�����
            String[] words = text.split("\\s+|\\.");
            int[] wordsLength = new int[words.length];
            //���ָ���ַ����ĳ���ֵ�洢����������ѭ���е���String.length();
            for (int i = 0; i < words.length; i++) {
                wordsLength[i] = words[i].length();
            }
            int num = 0;
            //Alice ����> Bob�ľ���
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals("Alice")) {
                    for (int j = i + 1; j < words.length; j++) {
                        int sum = 1;
                        if (words[j].equals("Bob")) {
                            for (int k = i + 1; k < j; k++) {
                                //ÿ�����ʵĳ��ȼӿո�ռ�ݵĳ���
                                sum += wordsLength[k] + 1;
                            }
                            if (sum <= K) {
                                num++;
                            }
                        }
                    }
                }
            }
            //Bob ����> Alice�ľ���
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
