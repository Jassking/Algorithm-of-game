package cn.lq.b_lq;
/*�����������ɴ�д��ĸ��Сд��ĸ��ɵ��ַ���(���Ƚ���1��10֮��)������֮��Ĺ�ϵ������4�����֮һ��
����1�������ַ������Ȳ��ȡ����� Beijing �� Hebei
����2�������ַ�������������ȣ�������Ӧλ���ϵ��ַ���ȫһ��(���ִ�Сд)������ Beijing �� Beijing
����3�������ַ���������ȣ���Ӧλ���ϵ��ַ����ڲ����ִ�Сд��ǰ���²��ܴﵽ��ȫһ�£�Ҳ����˵���������������2�������� beijing �� BEIjing
����4�������ַ���������ȣ����Ǽ�ʹ�ǲ����ִ�СдҲ����ʹ�������ַ���һ�¡����� Beijing �� Nanjing
��������ж�����������ַ���֮��Ĺ�ϵ�����������е���һ�࣬������������ı�š�*/
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String m = scanner.next();
        if (n.length() != m.length()) {
            System.out.println(1);
        } else if (n.equals(m)) {
            //���ò�����˶����ʾ��ͬ�ַ����е� String ����ʱ�������Ϊ true��
            System.out.println(2);
        } else if (n.equalsIgnoreCase(m)){
            //���� String ����һ�� String �Ƚϣ������Ǵ�Сд��
            //��������ַ����ĳ�����ͬ���������е���Ӧ�ַ�����ȣ����Դ�Сд��������Ϊ�������ַ�������ȵġ�
            System.out.println(3);
        }else {
            System.out.println(4);
        }
    }
}
