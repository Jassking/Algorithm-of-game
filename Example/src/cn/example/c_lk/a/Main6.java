package cn.example.c_lk.a;
/*6. �ϲ��������� II
�ϲ����������������������A��B���һ���µ����顣������ҲҪ����
����
���� 1:
����: A=[1], B=[1]
���:[1,1]
��������: ���غϲ�������顣
���� 2:
����: A=[1,2,3,4], B=[2,4,5,6]
���: [1,2,2,3,4,4,5,6]
��������: ���غϲ�������顣
��ս
���ܷ��Ż�����㷨���������һ������ܴ����һ�������С��*/
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] A={3,10,31,40,46,88};
        int[] B={2,3,4,5,6,7,10,11,12,13,14,15,20,21,22,23,34,56,67,89,99,100,101,123,134,135,190,309,450};
        System.out.println(Arrays.toString(mergeSortedArray(A, B)));
    }
    public static int[] mergeSortedArray(int[] A, int[] B) {
        int len= A.length;
        int len1=B.length;
        int[] sum=new int[len+len1];
        int ans=0;
        for (int i = 0; i <len ; i++) {//�Ƚ�A���������������
            sum[i]=A[i];
            ans++;//��¼A����洢�����±�����
        }
        int index=0;
        for (int i = ans; i <sum.length; i++) {//�Ӽ�¼���±�������ʼ��������B
            for (int j =index; j <len1;) {//��0��ʼ��һֱ��B����¼�����
                sum[i]=B[j];//��ʼ¼������B
                j++;//������B���±�����ƶ�һλ
                index=j;//ʹ��ÿ�ζ���ȡ�������ƶ�һλ��ֵ
                break;//��ֹsum������ͬһ��λ�õ���ֵ�ظ�¼�룬��������B¼�����
            }
        }
        Arrays.sort(sum);//������������
        return sum;
    }
}
