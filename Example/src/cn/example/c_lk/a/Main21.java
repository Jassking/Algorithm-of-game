package cn.example.c_lk.a;
/*1476. ɽ������Ķ�������
����
English

���ǰѷ����������Ե����� A ����ɽ����

A.length >= 3
���� 0 < i < A.length - 1 ʹ��A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
����һ��ȷ��Ϊɽ�������飬�����κ����� A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] �� i ��ֵ��
����

���� 1:

����: [0,1,0]
���: 1

���� 2:

����: [0,2,1,0]
���: 1

ע������

1.3 <= A.length <= 10000
2.0 <= A[i] <= 10^6
*/
public class Main21 {
    public static void main(String[] args) {
        int[] num={3,4,5,1};
        System.out.println(peakIndexInMountainArray(num));
    }
    public static int peakIndexInMountainArray(int[] A) {
        int sum=0;
        if (A.length<3){
            return 0;
        }
        for (int i = 1; i < A.length-1; i++) {
            if (A[i-1]<A[i]){
                if (A[i]>A[i+1]){
                    return i;
                }
            }
        }
        return 0;
    }
}
