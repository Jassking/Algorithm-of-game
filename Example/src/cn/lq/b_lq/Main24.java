package cn.lq.b_lq;

/*�� 2019 �ֽ�� 3 ��������ͬ��������֮�ͣ�����Ҫ��ÿ��������������
������ 2 �� 4��һ���ж����ֲ�ͬ�ķֽⷽ����
ע�⽻�� 3 ��������˳����Ϊͬһ�ַ��������� 1000+1001+18 ��
1001+1000+18 ����Ϊͬһ�֡�*/
public class Main24 {
    public static void main(String[] args) throws InterruptedException {
        int n = 0;
        for (int i = 1; i < 2019; i++) {
            for (int j = 1; j < 2019; j++) {
                for (int k = 1; k < 2019; k++) {
                    if (i + j + k == 2019) {
                        if (i != j && j != k && k != i) {
                            if (String.valueOf(i).contains("2") || String.valueOf(i).contains("4")) {
                                continue;
                            }
                            if (String.valueOf(j).contains("2") || String.valueOf(j).contains("4")) {
                                continue;
                            }
                            if (String.valueOf(k).contains("2") || String.valueOf(k).contains("4")) {
                                continue;
                            }
                            n++;
                            System.out.println(i + " " + j + " " + k);
                        }
                    }
                }
            }
        }
        n = n / 6;
        System.out.println(n);
    }
}
