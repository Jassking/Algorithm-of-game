package cn.lq.c_lq;

/*�����⣺���ķֽ�
�� 2019 �ֽ�� 3 ��������ͬ��������֮�ͣ�����Ҫ��ÿ�������������� ������ 2 �� 4��һ���ж����ֲ�ͬ�ķֽⷽ����
ע�⽻�� 3 ��������˳����Ϊͬһ�ַ��������� 1000+1001+18 �� 1001+1000+18 ����Ϊͬһ�֡�
�����ύ��
����һ�������յ��⣬��ֻ��Ҫ���������ύ���ɡ�����Ľ��Ϊһ�����������ύ��ʱֻ��д�����������д��������ݽ��޷��÷֡�*/
//�𰸣�40785
public class Main37 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 2019; i++) {
            if (String.valueOf(i).contains("2") || String.valueOf(i).contains("4")) {
                continue;
            }
            for (int j = 1; j < 2019; j++) {
                if (String.valueOf(j).contains("2") || String.valueOf(j).contains("4")) {
                    continue;
                }
                for (int k = 1; k < 2019; k++) {
                    if (String.valueOf(k).contains("2") || String.valueOf(k).contains("4")) {
                        continue;
                    }
                    if (i + j + k == 2019) {
                        if (i != j && j != k && k != i) {
                            sum++;
                            System.out.println(i+" "+j+" "+k);
                        }
                    }
                }
            }
        }
        sum /= 6;
        System.out.println(sum);
    }
}
