package cn.example.a_ex;
/*给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
示例 1:
输入: 123
输出: 321
 示例 2:
输入: -123
输出: -321
示例 3:
输入: 120
输出: 21
注意:
假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [?231,  231 ? 1]。
请根据这个假设，如果反转后整数溢出那么就返回 0。*/
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
