package cn.example.b_wy;

import java.util.Scanner;

/*
����һ���ַ�������������Ǽ�������ַ������ж��ٸ������Ӵ������Ĵ���һ�������ͷ�����һ�����ַ�������
���в�ͬ��ʼλ�û����λ�õĻ��Ĵ�����ʹ������ͬ���ַ���ɣ�Ҳ�ᱻ��Ϊ�ǲ�ͬ���Ӵ���
��������:
���������һ���ַ��������Ȳ��ᳬ�� 1000��
�������:
���������һ���Ǹ������� ���������ַ����ж��ٸ������Ӵ���
��������1:
abc
�������1:
3
��������2:
aaa
�������2:
6
*/
public class  Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String substring;
        String s = scanner.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1 ; j <= s.length(); j++) {
                substring = s.substring(i, j);
                if (afs(substring)) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
//    ����3��
//    private static boolean afs(String substring) {
//        StringBuilder stringBuffer=new StringBuilder(substring);
//        char[] chars = substring.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] != chars[chars.length - 1 - i]){
//                return false;
//            }
//        }
//        return true;
//    }
    private static boolean afs(String substring) {
        StringBuilder stringBuffer=new StringBuilder(substring);
        String string= stringBuffer.reverse().toString();
        char[] chars = substring.toCharArray();
        char[] chars1 = string.toCharArray();
        //����1��return stringBuffer.toString().equals(stringBuffer.reverse().toString());
        //����2��
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j <= i; j++) {
                if (chars[i]!=chars1[j]){
                    return false;
                }
            }
        }
        return true;
    }
}

