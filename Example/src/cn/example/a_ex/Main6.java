package cn.example.a_ex;
/*��дһ�������������ַ��������е������ǰ׺��
��������ڹ���ǰ׺�����ؿ��ַ��� ""��
ʾ�� 1:
����: ["flower","flow","flight"]
���: "fl"
ʾ�� 2:
����: ["dog","racecar","car"]
���: ""
����: ���벻���ڹ���ǰ׺��
˵��:
��������ֻ����Сд��ĸ a-z ��
*/

public class Main6 {
    public static void main(String[] args) {
        String[] n = {"flower", "flow"};
        System.out.println(longestCommonPrefix(n));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if ( i == strs[j].length()||strs[j].charAt(i) != c) {
                    /*strs[j].charAt(i) != c�������Ҫ����||���棬��Ϊ���һ�������������ڣ���ǰ��ᱨ��*/
                    /*if�����жϵ�һ�������Ƿ����㣬������Ż��жϵڶ�������*/
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
