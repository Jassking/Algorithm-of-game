package cn.example.a_ex;
/*����һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��
ʾ�� 1:
����: 123
���: 321
 ʾ�� 2:
����: -123
���: -321
ʾ�� 3:
����: 120
���: 21
ע��:
�������ǵĻ���ֻ�ܴ洢���� 32 λ���з���������������ֵ��ΧΪ [?231,  231 ? 1]��
�����������裬�����ת�����������ô�ͷ��� 0��*/
public class Main5 {
    class Solution {
        public int reverse(int x) {
            StringBuffer stringBuffer=new StringBuffer();
            StringBuffer stringBuffer1=new StringBuffer();
            StringBuffer sb = stringBuffer.append(x);
            String s=null;
            if (sb.substring(0,1).equals("-")){
                StringBuffer reverse1 = stringBuffer1.append(sb.substring(1));
                StringBuffer reverse = reverse1.reverse();
                s="-"+reverse;
            }else {
                StringBuffer re = sb.reverse();
                s = String.valueOf(re);
            }
            if (Long.parseLong(s)>2147483647||Long.parseLong(s)<-2147483648){
                return 0;
            }
            return Integer.parseInt(s);
        }
    }
}
