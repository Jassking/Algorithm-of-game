package cn.example.lqb.a2019;

import java.util.HashSet;
import java.util.Set;

/*
2.��ͬ���Ӵ���

    һ���ַ����ķǿ��Ӵ���ָ�ַ����г�������Ϊ1 ��������һ���ַ����
    �Ĵ������磬�ַ���aaab �зǿ��Ӵ�a, b, aa, ab, aaa, aab, aaab��һ��7 ����
    ע���ڼ���ʱ��ֻ�㱾�ʲ�ͬ�Ĵ��ĸ�����
    ���ʣ��ַ���0100110001010001 �ж��ٸ���ͬ�ķǿ��Ӵ���

    ����һ�������յ��⣬��ֻ��Ҫ���������ύ���ɡ�����Ľ��Ϊһ
    �����������ύ��ʱֻ��д�����������д��������ݽ��޷��÷֡�
*/
public class Main {
    public static void main(String[] args) {
        String s1 = "aaab";
        String s2 = "0100110001010001";
        System.out.println(subSum(s1));
        System.out.println(subSum(s2));
        int a[]=new int[5];
    }

    public static int subSum(String s) {
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < s.length(); i++) {
            for(int j = i ; j < s.length(); j++) {
                //��ÿһ���Ӵ������뵽set������
                set.add(s.substring(i, j + 1 ));
            }
        }
        return set.size();
    }
}
