package cn.example.c_lk.a;
/*13. �ַ�������
����һ�������� source �ַ�����һ�� target �ַ�������Ӧ���� source �ַ������ҳ� target �ַ������ֵĵ�һ��λ��(��0��ʼ)����������ڣ��򷵻� -1��
����
���� 1:
����: source = "source" �� target = "target"
���:-1
��������: ���source��û�а���target�����ݣ�����-1
���� 2:
����: source = "abcdabcdefg" ��target = "bcd"
���: 1
��������: ���source�����target�����ݣ�����target��source���һ�γ��ֵ�λ��
��ս
O(n2)���㷨�ǿ��Խ��ܵġ����������O(n)���㷨�������Ǹ��Ӻá�����ʾ��KMP��
˵��
�����������Ƿ���Ҫʵ��KMP�㷨��
    ����Ҫ�����������������������ʱ�����Թٺܿ���ֻ����Ҫ����һ����Ļ���Ӧ����������Ȼ����Ҫ�ȸ����Թ�ȷ�����Ҫ��ôʵ������⡣
*/
public class Main10 {
    public static void main(String[] args) {
        System.out.println(strStr("abfgbcd","bcd"));
    }
    public static int strStr(String source, String target) {
        if (source.isEmpty()&&target.isEmpty()){
            return 0;
        }
        if (source.isEmpty()){
            return -1;
        }
        if (target.isEmpty()){
            return 0;
        }
        int length = target.length();
        int len = source.length();
        if (len<length){
            return -1;
        }
        for (int i = 0; i < len-length; i++) {
            String substring = source.substring(i, length+i);
            if (substring.equals(target)){
                return i;
            }
        }
        if (source.substring(len-length,len).equals(target)){
            return len-length;
        }
        return -1;
    }
}
