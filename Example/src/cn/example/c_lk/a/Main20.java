package cn.example.c_lk.a;
/*9. ������
�ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
ʾ�� 1:
����: 121
���: true
ʾ�� 2:
����: -121
���: false
����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
ʾ�� 3:
����: 10
���: false
����: ���������, Ϊ 01 �����������һ����������
����:
���ܲ�������תΪ�ַ�����������������
*/
public class Main20 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder stringBuilder1=new StringBuilder();
        stringBuilder.append(x);
        stringBuilder1.append(x);
        stringBuilder1.reverse();
        if (stringBuilder.toString().equals(stringBuilder1.toString())){
            return true;
        }
        return false;
    }
}
