package cn.example.c_zj;
//5519. �������е��ʼ�Ŀո�
//����һ���ַ��� text �����ַ��������ɱ��ո��Χ�ĵ�����ɡ�ÿ��������һ�����߶��СдӢ����ĸ��ɣ�
// ������������֮�����ٴ���һ���ո���Ŀ����������֤ text ���ٰ���һ������ ��
//
//�����������пո�ʹÿ�����ڵ���֮��Ŀո���Ŀ�� ��� ���������� ��� ����Ŀ��
// �����������ƽ���������пո��� ������Ŀո�������ַ���ĩβ ��
// ��Ҳ��ζ�ŷ��ص��ַ���Ӧ����ԭ text �ַ����ĳ�����ȡ�
//
//���� �������пո����ַ��� ��
//
//
//
//ʾ�� 1��
//
//���룺text = "  this   is  a sentence "
//�����"this   is   a   sentence"
//���ͣ��ܹ��� 9 ���ո�� 4 �����ʡ����Խ� 9 ���ո�ƽ�����䵽���ڵ���֮�䣬���ڵ��ʼ�ո���Ϊ��9 / (4-1) = 3 ����
//ʾ�� 2��
//
//���룺text = " practice   makes   perfect"
//�����"practice   makes   perfect "
//���ͣ��ܹ��� 7 ���ո�� 3 �����ʡ�7 / (3-1) = 3 ���ո���� 1 ������Ŀո񡣶���Ŀո���Ҫ�����ַ�����ĩβ��
//ʾ�� 3��
//
//���룺text = "hello   world"
//�����"hello   world"
//ʾ�� 4��
//
//���룺text = "  walks  udp package   into  bar a"
//�����"walks  udp  package  into  bar  a "
//ʾ�� 5��
//
//���룺text = "a"
//�����"a"
//
//
//��ʾ��
//
//1 <= text.length <= 100
//text ��СдӢ����ĸ�� ' ' ���
//text �����ٰ���һ������
import java.util.Stack;

public class Main8 {
    public static void main(String[] args) {
        String s = "  w";
        System.out.println(reorderSpaces(s));
    }

    public static String reorderSpaces(String text) {
        int sum = 0;//�ո���
        int ans = 0;//������
        for (int i = 0; i < text.length(); i++) {//ͳ���ܵĿո���
            if (text.charAt(i) == ' ') {
                sum += 1;
            }
        }
        if (sum == 0) {//�ո���Ϊ0��ֻ�е��ʣ�ֱ�����
            return text;
        }
        Stack<Character> stack = new Stack<>();
        StringBuffer stats = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {//ͳ�Ƶ�����
            if (text.charAt(i) != ' ') {
                stack.push(text.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    ans += 1;
                }
                while (!stack.isEmpty()) {//���stack
                    stack.pop();
                }
            }
        }
        if (text.charAt(text.length() - 1) != ' ') {//�ж����һ���Ƿ�Ϊ��ĸ
            ans += 1;
        }
        if (ans == 1) {//�ж�ֻ��һ������
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != ' ') {
                    stats.append(text.charAt(i));
                }
            }
            for (int i = 0; i < sum; i++) {//�������ո�ֵ�����
                stats.append(' ');
            }
            return stats.toString();
        }
        int afs = sum / (ans - 1);//ƽ�����䵽���ڵ���֮��ո���
        int as = sum - (afs * (ans - 1));//����Ŀո���Ҫ�����ַ�����ĩβ
        char cc = ' ';
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        StringBuffer stringBuffer = new StringBuffer();
        String trim = text.trim();//ȥ�ַ�����β�ո�
        for (int i = 0; i < trim.length(); i++) {
            if (trim.charAt(i) != ' ') {
                stack1.push(trim.charAt(i));//�ж�����ĸ
            } else {
                if (trim.charAt(i) == ' ') {
                    stack2.push(trim.charAt(i));//���ո�ժ�����µ�ջ��
                }
                if (!stack1.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stringBuffer.append(stack1.pop());//��ջ�е���ĸ����
                    }
                    for (int j = 0; j < afs; j++) {//��ƽ���Ŀո�������
                        stringBuffer.append(cc);
                    }
                }
            }
        }
        while (!stack1.isEmpty()) {//�����һ�����ʼӵ���β
            stringBuffer.append(stack1.pop());
        }
        for (int j = 0; j < as; j++) {//������Ŀո���ӵ���β
            stringBuffer.append(cc);
        }
        Stack<Character> stack3 = new Stack<Character>();
        StringBuffer stringBuffer1 = new StringBuffer();
        //�����ʽ�����������
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) != ' ') {
                stack3.push(stringBuffer.charAt(i));
            }
            if (stringBuffer.charAt(i) == ' ') {
                while (!stack3.isEmpty()) {
                    stringBuffer1.append(stack3.pop());//����ջ�����ԣ����䵼���ٵ���
                }
                stringBuffer1.append(' ');//ÿ�ж�һ�οո񣬶�����
            }
        }
        while (!stack3.isEmpty()) {//�����һ�����ʼӵ����
            stringBuffer1.append(stack3.pop());
        }
        return stringBuffer1.toString();
    }
}
