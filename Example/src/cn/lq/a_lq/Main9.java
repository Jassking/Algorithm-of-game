package cn.lq.a_lq;
/*
С���������Ŀ����������3�������顣���ڽ������춼�ڼӰ��ء�Ϊ����ʿ����С�Ŵ����ÿ���鷢һ�����ң��ݴ����ܲ��ԣ�������Ҫ���ǣ�
1. ����ĺ�������������ͬ
2. �����ڱ�����ƽ�ֺ��ң���Ȼ�ǲ��ܴ���ģ�
3. �����ṩ����1,2��������С��������Լ�ָ����
*/
import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //����С������������������С�����������������ĳ˻��������Լ��
        int fun = a * b / afs(a, b);
        int sum = fun * c / afs(fun, c);
        System.out.println(sum);
    }
    //�ݹ鷨�����Լ��
    private static int afs(int a, int b) {
        if (a < b) {//�ж�a��b�Ĵ�С
            int temp = a;
            a = b;
            b = temp;
        }
        //a % b (�����Ǵ���%С��)
        if (a % b != 0) {
            int k = a % b;
            return afs(b, k);
        }
        return b;
    }
}
