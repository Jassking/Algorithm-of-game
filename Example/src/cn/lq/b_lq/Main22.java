package cn.lq.b_lq;

import java.util.LinkedHashSet;
import java.util.Set;

/*һ���ַ����ķǿ��Ӵ���ָ�ַ����г�������Ϊ 1 ��������һ���ַ���� �Ĵ���
���磬�ַ���aaab �зǿ��Ӵ�a, b, aa, ab, aaa, aab, aaab��һ�� 7 ����
ע���ڼ���ʱ��ֻ�㱾�ʲ�ͬ�Ĵ��ĸ����� ���ʣ��ַ���0100110001010001 �ж��ٸ���ͬ�ķǿ��Ӵ���*/
public class Main22 {
    public static void main(String[] args) {
        Set<String> strings=new LinkedHashSet<>();//Set���ܴ��ظ�������
        String s="0100110001010001";
        for (int i = 0; i < s.length(); i++) {//���ѭ����ʼ��ȡλ��
            for (int j = i+1; j <=s.length(); j++) {//�ڲ�ѭ��������ȡλ��
                String a=s.substring(i,j);//����һ���µ����ַ���
                strings.add(a);
            }
        }
        System.out.println(strings.size());
    }
}
