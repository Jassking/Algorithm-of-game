package cn.example.lqb.c2017;

import java.util.Scanner;

/*��1�������ĵ�kλ�����кܶ��ַ�����*/
public class Main2 {
    static int len(int x){
        if(x<10) return 1;
        return len(x/10)+1;
    }

    // ȡx�ĵ�kλ����
    static int f(int x, int k){
        if(len(x)-k==0) return x%10;
        return f(x/10,k);  //���
//        return ______________________;  //���
    }

    public static void main(String[] args)
    {
        int x = 23513;
        //System.out.println(len(x));
        System.out.println(f(x,3));
    }
}
