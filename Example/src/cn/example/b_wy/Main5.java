package cn.example.b_wy;

import java.util.Scanner;

/*һ����Сд��ĸ��ɵ��ַ������Կ���һЩͬһ��ĸ�������Ƭ��ɵġ�����,"aaabbaaac"����������Ƭ��ɵ�:'aaa','bb','c'��
ţţ���ڸ���һ���ַ���,���������������ַ�����������Ƭ��ƽ�������Ƕ��١�
��������:
�������һ���ַ���s,�ַ���s�ĳ���length(1 �� length �� 50),sֻ��Сд��ĸ('a'-'z')
�������:
���һ������,��ʾ������Ƭ��ƽ������,�������뱣����λС����
��������ʾ: s = "aaabbaaac"
������Ƭ��ƽ������ = (3 + 2 + 3 + 1) / 4 = 2.25
��������1:
aaabbaaac
�������1:
2.25
*/
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        double length = string.length();
        int sum = 1;
        for (int i =0; i <string.length()-1 ; i++) {
            if (string.charAt(i) != string.charAt(i + 1)) {
                sum++;
            }
        }
        //�ܳ���/��ͬ�ַ�����Ƭ����
        double i = (length / sum);
        System.out.println(String.format("%.2f",i));//������λС��

    }
}
