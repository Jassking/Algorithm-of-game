package cn.example.c_lk.b;
/*5396. �����ַ�
����һ���ַ��� s ���ַ����ġ�����������Ϊ��ֻ����һ���ַ�����ǿ����ַ����ĳ��ȡ�

���㷵���ַ�����������



ʾ�� 1��

���룺s = "leetcode"
�����2
���ͣ����ַ��� "ee" ����Ϊ 2 ��ֻ�����ַ� 'e' ��
ʾ�� 2��

���룺s = "abbcccddddeeeeedcba"
�����5
���ͣ����ַ��� "eeeee" ����Ϊ 5 ��ֻ�����ַ� 'e' ��
ʾ�� 3��

���룺s = "triplepillooooow"
�����5
ʾ�� 4��

���룺s = "hooraaaaaaaaaaay"
�����11
ʾ�� 5��

���룺s = "tourist"
�����1


��ʾ��

1 <= s.length <= 500
s ֻ����СдӢ����ĸ��*/

public class Main32 {
    public static void main(String[] args) {
        System.out.println(maxPower("b"));
    }
    public static int maxPower(String s) {
        char[] chars = s.toCharArray();
        if (s.isEmpty()){
            return 0;
        }
        if (s.length()==1){
            return 1;
        }
        char c=chars[0];//�õ���һ������
        int count=1;//�ǿ����ַ����ĳ��ȳ�������Ϊ1
        int maxLen=0;//��¼��ǿ����ַ����ĳ���
        for (int i = 1; i < chars.length; i++) {
            if (c==chars[i]){//�жϵ�ǰ�ַ��Ƿ�����һ���ַ����
                ++count;
            }else {
                c=chars[i];//����ȣ������һ���ַ���ֵ����ǰ�ַ�
                count=1;//���½��ǿ����ַ����ĳ��ȳ�������Ϊ1
            }
            maxLen=Math.max(count,maxLen);
        }
        return maxLen;
    }
}
