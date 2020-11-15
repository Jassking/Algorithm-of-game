package cn.sf.b_jz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
/*
����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
��������:
����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
*/
public class Demo16 {
    public static ArrayList<String> Permutation(String str) {
        char[] chars = str.toCharArray();
        ArrayList<String>  list=new ArrayList<>();
        solve(list,chars,0,str.length());
        list=new ArrayList<String>(new HashSet<String>(list));
        Collections.sort(list);
        return list;
    }

    private static void solve(ArrayList<String> list, char[] chars, int index, int length) {
        if (index==length-1){
            list.add(String.valueOf(chars));
        }else {
            for (int i = index; i < length; i++) {
                char temp=chars[i];
                chars[i]=chars[index];
                chars[index]=temp;
                solve(list,chars,index+1,length);
                temp=chars[i];
                chars[i]=chars[index];
                chars[index]=temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Permutation("abc"));
    }
}
