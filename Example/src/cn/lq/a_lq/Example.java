package cn.lq.a_lq;

import java.util.Scanner;
//����������˷�
public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String m = in.next();
        String result = multiply(n, m);
        System.out.println(result);
    }
    // ���������������
    private static String multiply(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder(); //�����洢���
        StringBuilder stringBuilder1 = new StringBuilder(a);
        StringBuilder stringBuilder2 = new StringBuilder(b);
        //��ת����������,�Ա�Ӹ�λ��ʼ���
        stringBuilder1.reverse();
        stringBuilder2.reverse();
        int[] arrays = new int[stringBuilder1.length() + stringBuilder2.length()];//�������м������
        for(int i = 0; i < stringBuilder1.length(); i++){
            for(int j =0; j < stringBuilder2.length();j++){
                //��λ���,��������ÿһλ���ۼӺ�
                int k = (stringBuilder1.charAt(i) - '0') * (stringBuilder2.charAt(j) - '0');
                arrays[i+j]=arrays[i+j]+ k;
            }
        }
        for(int i = 0; i < arrays.length - 1; i++){
            int n=arrays[i] / 10;//ÿһλ����ʮ�Ľ�λ,��������
            arrays[i+1] =arrays[i+1]+ n;
            arrays[i] %= 10;
        }
        for(int i = 0; i < arrays.length - 1; i++){//�ѽ��ѭ����ӵ���
            stringBuilder.append(arrays[i]);
        }
        return stringBuilder.reverse().toString();
    }
}


