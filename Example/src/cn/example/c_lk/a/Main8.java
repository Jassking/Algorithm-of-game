package cn.example.c_lk.a;
/*83. �䵥���� II
����3*n + 1 ���Ǹ�������������һ������֮������ÿ�����־��������Σ��ҵ�������֡�
����
���� 1:
����:  [1,1,2,3,3,3,2,2,4,1]
���:  4
���� 2:
����: [2,1,2,2]
���:  1
��ս
һ�α������������Ķ���ռ临�Ӷ�*/
import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        int[] s = {6, 1, 1, 1, 2, 2, 2, 4, 5, 6, 4, 5, 0, 4, 5, 6};
        System.out.println(singleNumber(s));
    }

    public static int singleNumber(int[] A) {
        if (A.length == 1) {//�ж�����Aֻ��һ����ֵ
            return A[0];
        }
        Arrays.sort(A);//������A��������
        for (int i = 0; i < A.length - 2; i += 3) {
            //ֻ�жϵ�ǰ������ֵ�Ƿ���ȣ���һ�����ж���һ���������ֵ�Ƿ���ȣ�����i+=2
            if (A[i] == A[i + 1] && A[i + 1] == A[i + 2]) {//��Ⱦ���������ѭ��

            } else {
                return A[i];//��������������
            }
        }
        int len = A.length;
        //��ֹ���һλ��ֵ�ǵ�����ֵ
        if (A[len - 1] == A[len - 2] && A[len - 2] == A[len - 3]) {

        } else {
            return A[len - 1];//��������������
        }
        return 1;
    }
}
