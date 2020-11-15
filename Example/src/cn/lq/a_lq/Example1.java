package cn.lq.a_lq;

import java.util.Scanner;

public class Example1 {
    //����������ӷ�
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String m = in.next();
        String result = add(n, m);
        System.out.println(result);
    }

    // ���������������
    private static String add(String a, String b) {
        StringBuilder sb = new StringBuilder(); //�����洢���
        StringBuilder stringBuilder1 = new StringBuilder(a);
        StringBuilder stringBuilder2 = new StringBuilder(b);
        //��ת����������,�Ա�Ӹ�λ��ʼ���
        stringBuilder1.reverse();
        stringBuilder2.reverse();
        String maxLen = a.length() > b.length() ? a : b;
        int[] arrays = new int[maxLen.length() + 1];//�������м������
        int[] n = new int[maxLen.length()+1];
        int[] m = new int[maxLen.length()+1];
        for (int j = 0; j < stringBuilder1.length(); j++) {
            n[j] = stringBuilder1.charAt(j) - '0';
        }for (int k = 0; k < stringBuilder2.length(); k++) {
            m[k] = stringBuilder2.charAt(k) - '0';
        }
        for (int i = 0; i < arrays.length; i++) {
            int temp = arrays[i];
            temp += n[i];
            temp += m[i];
            if (temp >= 10) {
                temp = temp - 10;
                arrays[i + 1] = 1;
            }
            arrays[i] = temp;
        }
        boolean ans=false;
        for (int i = arrays.length-1; i >=0; i--) {
            if(!ans){
                if(arrays[i] == 0){				//���������������ĩβ��0
                    continue;
                }
                ans = true;
            }
            sb.append(arrays[i]);
        }
        return sb.toString();
    }
}




