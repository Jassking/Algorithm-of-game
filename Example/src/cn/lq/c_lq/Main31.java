package cn.lq.c_lq;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*С���������� hello ���ֵ��ʷǳ�����Ȥ�����ֵ��ʿ������÷�Ϊ�ĶΣ�
��һ����һ������������ĸ��ɣ�
�ڶ�����һ������Ԫ����ĸ��ɣ�
��������һ������������ĸ��ɣ�
���Ķ���һ������Ԫ����ĸ��ɡ�
��������һ�����ʣ����ж���������Ƿ�Ҳ�����ֵ��ʣ�����������yes�����������no��
����Ԫ����ĸ���� a, e, i, o, u���������������Ϊ������ĸ��
�����ʽ
��������һ�У�����һ�����ʣ�������ֻ����СдӢ����ĸ��
�����ʽ
��������𰸣�����Ϊyes������Ϊno��*/
public class Main31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Set<Character> setYes = new LinkedHashSet<>();
        Set<Character> setNo = new LinkedHashSet<>();
        for (char i = 'a'; i <= 'z'; i++) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                setYes.add(i);
            } else {
                setNo.add(i);
            }
        }
        int n = 0;
        int q = 0;
        int w = 0;
        int e = 0;
        int r = 0;
        while (n < s.length() && setNo.contains(s.charAt(n))) {
            q = 1;
            n++;
        }
        while (n < s.length() && setYes.contains(s.charAt(n))) {
            w = 1;
            n++;
        }
        while (n < s.length() && setNo.contains(s.charAt(n))) {
            e = 1;
            n++;
        }
        while (n < s.length() && setYes.contains(s.charAt(n))) {
            r = 1;
            n++;
        }
        if (q < s.length() && q == 1 && w == 1 && e == 1 && r == 1) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
