package cn.lq.b_lq;

/*�������� 1, 1, 1, 3, 5, 9, 17, �����ӵ� 4 �ʼ��ÿ���ǰ 3 ��ĺ͡���
�� 20190324 ������ 4 λ���֡�*/
public class Main23 {
    public static void main(String[] args) {
        int[] a=new int[20190324];
        for (int i = 0; i < 20190324; i++) {
            a[0]=1;
            a[1]=1;
            a[2]=1;
            if (i>2){
                a[i]=(a[i-1]+a[i-2]+a[i-3])%10000;//���������λ����
            }
        }
        System.out.println(a[20190323]);
    }
}
