package cn.example.c_zj;
/*
�ҽ����󴸣���һ�ҳ�����ı༭���Ҹ���У��Ͷ������Ӣ�ĸ������ݹ����ǳ����ˣ���Ϊÿ�춼Ҫȥ����������ƴд���󡣵��ǣ��������������ƽ���Ĺ����з��������ҷ���һ������ƴд����Ľݾ���
1. ����ͬ������ĸ����һ��һ����ƴд����ȥ��һ���ľͺ��������� helllo -> hello
2. ����һ������ĸ��AABB�ͣ�����һ��һ����ƴд����ȥ���ڶ��Ե�һ����ĸ�ͺ��������� helloo -> hello
3. ����Ĺ������ȡ������ҡ�ƥ�䣬�������AABBCC����ȻAABB��BBCC���Ǵ���ƴд��Ӧ�����ȿ����޸�AABB�����ΪAABCC
�������Ǹ���ţ���������ѧ���ھ���ͳ�����ƣ��������ԭ��д��һ���Զ�У����������Ч�ʴӴ���ɡ��ò��˶�ã��Ҿͻ����CEO�����϶��³���ӭȢ�׸��������������۷壬���붼�е�С�����أ�
����
����û�뵽���ұ������ˣ�����ʱ�ϰ����˵�� ����������Ҫ����ҵҵ�����ڿҿҡ������ַ֣���Ҫ���У���һ����һ�С�һ���������У�Ҫ�ǲ��У���һ�в���һ�У�һ�в������в��С��� �����������˺����л��㱵ġ���
�����⣺��ʵ�ִ󴸵��Զ�У�Գ���
��������:
��һ�а���һ������N����ʾ���������������ٸ���У����ַ�����
�������N�У�ÿ��Ϊһ����У����ַ�����
�������:
N�У�ÿ�а���һ�����޸�����ַ�����
ʾ��1
����
2
helloo
wooooooow
���
hello
woow*/

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());//���������������ٸ���У����ַ�����
        for (int i = 0; i < n; i++) {
            StringBuffer stringBuffer = new StringBuffer(scanner.next());//һ��һ���ַ��������
            for (int j = 0; j < stringBuffer.length() - 3; j++) {
                if (stringBuffer.charAt(j) == stringBuffer.charAt(j + 1) && stringBuffer.charAt(j + 1) == stringBuffer.charAt(j + 2)) {
                    //�ж�����ͬ������ĸ����һ��
                    stringBuffer.deleteCharAt(j);
                    j--;
                } else if (stringBuffer.charAt(j) == stringBuffer.charAt(j + 1) && stringBuffer.charAt(j + 2) == stringBuffer.charAt(j + 3)) {
                    //����һ������ĸ��AABB�ͣ�����һ��
                    stringBuffer.deleteCharAt(j + 2);
                    j--;
                }
            }
            int length = stringBuffer.length();
            //�ж������λ�ַ��Ƿ���AAA
            if (stringBuffer.charAt(length - 1) == stringBuffer.charAt(length - 2) && stringBuffer.charAt(length - 2) == stringBuffer.charAt(length - 3)) {
                stringBuffer.deleteCharAt(length - 1);
            }
            System.out.println(stringBuffer.toString());//ÿ�ж���һ���ַ����������
        }
    }
}
