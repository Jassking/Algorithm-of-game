package cn.example.c_lk.a;

/*����һ���ַ��������ַ��������ʽ��������һ��ƫ����������ƫ����ԭ����ת�ַ���(����������ת)��*/
/*ԭ����ת��ζ����Ҫ��s��������޸ġ��㲻��Ҫ�����κζ�����
����
���� 1:
����:  str="abcdefg", offset = 3
���:  str = "efgabcd"
��������:  ע����ԭ����ת����str��ת��Ϊ"efgabcd"
���� 2:
����: str="abcdefg", offset = 0
���: str = "abcdefg"
��������: ע����ԭ����ת����str��ת��Ϊ"abcdefg"
���� 3:
����: str="abcdefg", offset = 1
���: str = "gabcdef"
��������: ע����ԭ����ת����str��ת��Ϊ"gabcdef"
���� 4:
����: str="abcdefg", offset =2
���: str = "fgabcde"
��������: ע����ԭ����ת����str��ת��Ϊ"fgabcde"
���� 5:
����: str="abcdefg", offset = 10
���: str = "efgabcd"
��������: ע����ԭ����ת����str��ת��Ϊ"efgabcd"
��ս
��������ԭ����ת��ʹ��O(1)�Ķ���ռ�
*/
public class Main3 {
    public static void main(String[] args) {
        String string = "";
        char[] str = string.toCharArray();
        rotateString(str, 3);
    }

    public static void rotateString(char[] str, int offset) {
        if (str.length == 0 || offset == 0) {
            return;
        }
        offset = offset % str.length;//ʵ��ƫ����
        for (int j = 0; j < offset; j++) {//ÿ�����ƫ��һλ
            char temp = str[str.length - 1];//�洢���һ����
            for (int i = str.length - 1; i > 0; i--) {//�±�ĺ�һ������ǰһ��, ʵ����������ƫ��һλ,
                str[i] = str[i - 1];
            }
            str[0] = temp;//���洢���һ������ֵ�������һ��λ��
        }
        System.out.println(str);
    }
}
