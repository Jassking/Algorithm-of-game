package cn.lq.a_lq;

import java.util.Scanner;
//�������������
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String m = in.next();
        String result = subtraction(n, m);
        System.out.println(result);
        }
    public static String subtraction(String n, String m) {
        // ���ַ�����ת��ת�����ַ�����
        char[] a = new StringBuilder(n).reverse().toString().toCharArray();
        char[] b = new StringBuilder(m).reverse().toString().toCharArray();
        int lenA = a.length;
        int lenB = b.length;
        // �ҵ���󳤶�
        int len = lenA > lenB ? lenA : lenB;
        int[] result = new int[len];
        // ��ʾ���������
        char sign = '+';
        // �ж����ս��������
        if (lenA < lenB) {
            sign = '-';
        } else if (lenA == lenB) {
            int i = lenA - 1;
            while (i > 0 && a[i] == b[i]) {
                i--;
            }
            if (a[i] < b[i]) {
                sign = '-';
            }
        }
        // ����������������ս��Ϊ������ô��a-b����Ļ���b-a
        for (int i = 0; i < len; i++) {
            int aint = i < lenA ? (a[i] - '0') : 0;
            int bint = i < lenB ? (b[i] - '0') : 0;
            if (sign == '+') {
                result[i] = aint - bint;
            } else {
                result[i] = bint - aint;
            }
        }
        // �����������е�ĳһλС���㣬��ô����ǰһλ��һ��Ȼ�󽫱�λ����10����ʵ���൱�ڽ�λ������
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] < 0) {
                result[i + 1] -= 1;
                result[i] += 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        // ������ս��Ϊ��ֵ���ͽ����ŷ�����ǰ�棬��������Ҫ
        if (sign == '-') {
            sb.append('-');
        }
        // �ж��Ƿ���ǰ��0
        boolean flag = true;
        for (int i = len - 1; i >= 0; i--) {
            if (result[i] == 0 && flag) {
                continue;
            } else {
                flag = false;
            }
            sb.append(result[i]);
        }
        if (sb.toString().equals("")) {
            sb.append("0");
        }
        return sb.toString();
    }
}

