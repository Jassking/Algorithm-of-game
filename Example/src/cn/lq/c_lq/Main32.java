package cn.lq.c_lq;

import java.util.Scanner;
/*С����һ��յأ��������յػ���Ϊ n �� m �е�С�飬ÿ�к�ÿ�еĳ��ȶ�Ϊ 1��
����С��ѡ�����е�һЩС��յأ������˲ݣ�����С����Ȼ�����ǿյء�
������Щ�ݳ��úܿ죬ÿ���£��ݶ������ⳤ��һЩ�����һ��С�����˲ݣ����������Լ����ϡ��¡�������С��յ���չ������С��յض�����Ϊ�вݵ�С�顣
���������С����k ���º�յ�����Щ�ط��вݡ�
�����ʽ
��������ĵ�һ�а����������� n, m��
���������� n �У�ÿ�а��� m ����ĸ����ʾ��ʼ�Ŀյ�״̬����ĸ֮��û�пո����ΪС���㣬��ʾΪ�յأ������ĸΪ g����ʾ���˲ݡ�
��������������һ������ k��
�����ʽ
������� n �У�ÿ�а��� m ����ĸ����ʾ k ���º�յص�״̬�����ΪС���㣬��ʾΪ�յأ������ĸΪ g����ʾ���˲ݡ�
��������
4 5
.g...
.....
..g..
.....
2
�������
gggg.
gggg.
ggggg
.ggg.*/
public class Main32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//��
        int m = scanner.nextInt();//��
        String[] a = new String[n];
        char[][] chars = new char[n][m];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.next();
        }
        int month = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                chars[i][j]=a[i].charAt(j);
            }
        }
        char[][] ca=new char[n][m];
        for (int k = 0; k < month; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (chars[i][j] == 'g') {
                        ca[i][j]='g';
                        if (i - 1 >= 0) {
                            ca[i - 1][j] = 'g';//��
                        }
                        if (i + 1 < n) {
                            ca[i + 1][j] = 'g';//��
                        }
                        if (j - 1 >= 0) {
                            ca[i][j - 1] = 'g';//��
                        }
                        if (j + 1 < m) {
                            ca[i][j + 1] = 'g';//��
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    chars[i][j]=ca[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (chars[i][j]=='g'){
                    System.out.print(chars[i][j]);
                }else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }
}
