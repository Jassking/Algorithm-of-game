package cn.example.b_wy;
/*С�׸�����һ������Ϊ�����������У���ÿ�ο���ʹ�õĴ��۽�ĳ������һ���߼�һ��
��ϣ�������ٵĴ���ʹ���������ĳ˻����ڣ�����С���ۣ�����������ÿ����Ҳ����������������
��������:
��һ������,��ʾ���г��Ⱥ�Ŀ��˻���
������һ�и���������ʾ��ʼ���С�
�������:
һ��һ�����ֱ�ʾ��
��������1:
5 12
1 3 9 2 6
�������1:
10
����˵��1:
��3��Ϊ1��Ҫ2�Ĵ��ۣ���9��Ϊ1��Ҫ8�Ĵ��ۣ��ܴ���Ϊ10��
��������2:
3 15
3 8 7
�������2:
9
����˵��2:
��8��Ϊ5��Ҫ3�Ĵ��ۣ���7��Ϊ1��Ҫ6�Ĵ��ۣ��ܴ���Ϊ9��
*/
/*
����:
100 505
977 205 100 401 363 135 496 355 897 85 127 109 635 97 491 101 526 342 451 49 896 809 281 399 379 928 667 559 416 65 401 47 625 105 93 389 771 195 616 161 31 561 616 303 736 961 665 805 423 989 137 972 868 126 736 913 768 57 288 614 927 475 741 49 810 1 911 425 849 387 990 915 441 831 315 61 697 16 479 577 596 708 189 709 29 961 967 986 761 409 170 615 457 506 541 131 250 805 727 287

��Ӧ���Ӧ��Ϊ:

48410

������Ϊ:

48810*/

import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();//һ�и���������ʾ��ʼ����
        int sum = 0;
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        while (m != 1) {
            for (int i = list.size() - 1; i >= 0; i--) {
                if (m % list.get(i) == 0) {
                    m = m / list.get(i);
                    list.remove(i);
                }
            }
            if (m != 1) {
                for (int i = list.size()-1; i >0 ; i--) {
                    int integer = list.get(i);
                    while (m % integer != 0) {
                        integer--;
                        sum++;
                    }
                    m = m / integer;
                    list.remove(list.size()-1);
                }
            }
        }
        if (list.size()!=0) {
            for (Integer integer : list) {
                sum += integer - 1;
            }
        }
        System.out.println(sum);
    }
}

