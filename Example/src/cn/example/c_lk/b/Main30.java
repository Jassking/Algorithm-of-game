package cn.example.c_lk.b;

import java.util.ArrayList;
import java.util.List;
/*1441. ��ջ������������

����һ��Ŀ������ target ��һ������ n��ÿ�ε�������Ҫ��  list = {1,2,3..., n} �������ȡһ�����֡�

��ʹ����������������Ŀ������ target ��

    Push���� list �ж�ȡһ����Ԫ�أ� ���������������С�
    Pop��ɾ�������е����һ��Ԫ�ء�
    ���Ŀ�����鹹����ɣ���ֹͣ��ȡ����Ԫ�ء�

��Ŀ���ݱ�֤Ŀ�������ϸ����������ֻ���� 1 �� n ֮������֡�

�뷵�ع���Ŀ���������õĲ������С�

��Ŀ���ݱ�֤����Ψһ�ġ�



ʾ�� 1��

���룺target = [1,3], n = 3
�����["Push","Push","Pop","Push"]
���ͣ�
��ȡ 1 ���Զ��������� -> [1]
��ȡ 2 ���Զ��������飬Ȼ��ɾ���� -> [1]
��ȡ 3 ���Զ��������� -> [1,3]
*/
public class Main30 {
    public static void main(String[] args) {
        int[] num={} ;
        System.out.println(buildArray(num,4));
    }
    public static List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        if (target.length==0){//�ж������Ƿ�Ϊ��
            list.add("0");
            return list;
        }
        int index=0;
        for (int i = 1; i <= n; i++) {//list = {1,2,3..., n} �������ȡһ������
            for (int j = index; j < target.length; ) {//���� target
                if (target[j]!=i){
                    list.add("Push");
                    list.add("Pop");
                    break;
                }else {
                    list.add("Push");
                    index=++j;//����ȣ���������һ�����ֽ��бȶ�
                    break;
                }
            }
        }
        return list;
    }
}
