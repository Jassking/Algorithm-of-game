package cn.example.c_lk.a;

import java.util.ArrayList;
import java.util.List;
/*1903. ����ͳ��
��˾�����ṩ������Ա������Ϣ��������ID���������������š�
�Լ�����֮������ѹ�ϵ��ÿ����ϵ����2��ID��ɣ��� "1, 2" ����1��Ա����2��Ա�������ѡ�
���ѹ�ϵ�����д����ԣ���B��C����A�����ѣ���B��C��һ�������ѡ�
�����ÿ�����������������ŵ�Ա�������ѹ�ϵ��Ա��������
����
��������:
employees = [
  "1, Bill, Engineer",
  "2, Joe, HR",
  "3, Sally, Engineer",
  "4, Richard, Business",
  "6, Tom, Engineer"
]
friendships = [
  "1, 2",
  "1, 3",
  "3, 4"
]
�������:
"Engineer: 2 of 3"
"HR: 1 of 1"
"Business: 1 of 1"
˵��
�����У�Engineer��1��Ա����HR��2��Ա�������ѹ�ϵ��3��Ա����Business��4��Ա�������ѹ�ϵ������Engineer��2���˺��������������ѹ�ϵ�����"Engineer: 2 of 3����
ע������
���е������ж��ź󶼸���һ���ո񣬶�����ĳ������ҲҪ��������ʽ��ͬ��
���ص��б���˳��û��Ҫ��
Ա����Ϣ���� N <= 50 ����
���ѹ�ϵ������ M <= 1000 ����
Ա��ID����100���ڵ����֡�
������ K <= 20��
*/
public class Main12 {
    public List<String> departmentStatistics(List<String> employees, List<String> friendships) {
        List<String> list=new ArrayList<>();
        int size = employees.size();
        for (int i = 0; i < size; i++) {
            String s = list.get(i);

        }
        return list;
    }
}