package cn.sf.b_jz;

import java.util.ArrayList;

/*����һ���������飬ʵ��һ�����������������������ֵ�˳��
ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣*/
public class Demo13 {
    public void reOrderArray(int[] array) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();//�洢����
        ArrayList<Integer> arrayList2 = new ArrayList<>();//�洢ż��
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrayList1.add(array[i]);
            }else {
                arrayList2.add(array[i]);
            }
        }
        //�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿��
        int index=0;//��¼�����±�
        for (int i : arrayList1) {//ѭ����arrayList1�������ó�һ������ֵ��i
            array[index++]=i;//��arrayList1�е������������ӵ�array������
        }
        for (int i : arrayList2) {//ѭ����arrayList2�������ó�һ������ֵ��i
            array[index++]=i;//��arrayList1�е������������ӵ�array������
        }
    }
}
