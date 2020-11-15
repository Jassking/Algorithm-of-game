package cn.sf.b_jz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
/*
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
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
