package cn.lq.c_lq;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*��һ�⣺���
��Ϊ����ӽ���������Ҫ������������ѡ�� 1 ��λ�� 5 ��λ��һ����Ա�� �����ӵ��׷����ݡ�
ÿλ��Ա���� 1 ��λ�� 5 ��λʱ���������±���ʾ����������׷����� 1 ��λ�� 5 ��λ������֮���������Ƕ��٣�
���������������ָ��Ƶ��ı��ļ��У�����ؼ�鸴�Ƶ������Ƿ����� ���е�һ�¡�
������Ŀ¼����һ���ļ� team.txt���������������е���ͬ�� ��ע���һ���Ǳ�ţ�
�����ύ��
����һ�������յ��⣬��ֻ��Ҫ���������ύ���ɡ�����Ľ��Ϊһ �����������ύ��ʱֻ��д�����������д��������ݽ��޷��÷֡�*/
/*�𰸣�490*/
/*�ڶ��⣺��ͬ�Ӵ�
һ���ַ����ķǿ��Ӵ���ָ�ַ����г�������Ϊ 1 ��������һ���ַ���ɵĴ���
���磬�ַ���aaab �зǿ��Ӵ�a, b, aa, ab, aaa, aab, aaab��һ�� 7 ���� ע���ڼ���ʱ��ֻ�㱾�ʲ�ͬ�Ĵ��ĸ�����
���ʣ��ַ���0100110001010001 �ж��ٸ���ͬ�ķǿ��Ӵ���
�����ύ��
����һ�������յ��⣬��ֻ��Ҫ���������ύ���ɡ�����Ľ��Ϊһ�����������ύ��ʱֻ��д�����������д��������ݽ��޷��÷֡�*/
//�𰸣�100
public class Main35 {
    public static void main(String[] args) {
        Set<String> stringSet=new LinkedHashSet<>();
        String s="0100110001010001";
//        String s="aaab";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String substring = s.substring(i,j);
                stringSet.add(substring);
            }
        }
        System.out.println(stringSet.toString());
        System.out.println(stringSet.size());
    }
}
