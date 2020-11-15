package cn.example.lqb.cyzs;

import java.util.*;
/*试题:子串分值和
时间限制: 1.0s内存限制:512.0MB本题总分:25分
【问题描述】
对于一个字符串S，我们定义S的分值f(S)为S中出现的不同的字符个
数。例如f("aba")= 2，f("abc")= 3，f("aaa")= 1。
现在给定一个字符串S[o..n -1]（长度为n)，请你计算对于所有S的非空
子串S[i..](0≤i≤ j<n)，f(S[i..j])的和是多少。
*/
//未完成
public class Main4 {
    public static void main(String[] args) {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.next();
//        char[] chars = string.toCharArray();
//        Map<Character,Integer> map=new HashMap<>();
//        for ( char cm:chars){
//            if (map.containsKey(cm)){
//                Integer v=map.get(cm);
//                v++;map.put(cm,v);
//            }else{
//                map.put(cm,1);
//            }
//        }
//        int sum=0;
//        ArrayList<Character> list=new ArrayList<>();
//        Set<Character> ss=map.keySet();
//        for (Character cq:ss) {
//            sum=Math.max(sum,map.get(cq));
//        }
//        for (Character cq:ss) {
//            if (map.get(cq)==sum){
//                list.add(cq);
//            }
//        }
//        int min=1000000;
//        for (int i = 0; i <list.size(); i++) {
//            Character character = list.get(i);
//            min=Math.min(character,min);
//        }
//        System.out.println((char) min);
//        System.out.println(sum);
//    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int student = scanner.nextInt();
//        int fenshu[] = new int[student];
//        double sum = 0.00;
//        for (int i = 0; i < student; i++) {
//            fenshu[i] = scanner.nextInt();
//        }
//        Arrays.sort(fenshu);
//        System.out.println(fenshu[student - 1]);
//        System.out.println(fenshu[0]);
//        for (int i = 0; i < fenshu.length; i++) {
//            sum += fenshu[i];
//        }
//        double avg = sum / student;
//        DecimalFormat ass = new DecimalFormat("#0.00");
//        ass.format(avg);
//        System.out.println(ass.format(avg));
//    }






    /*
闰年是366
*/
//    public static void main(String[] args) {
////761
//        int sum=0;
//        for (int i = 1; i <= 2020; i++) {
//            StringBuffer stringBuffer=new StringBuffer();
//            stringBuffer.append(i);
//            for (int j = 0; j < stringBuffer.length(); j++) {
//                char c = stringBuffer.charAt(j);
//                if (c=='2'){
//                    sum++;
//                }
//            }
//        }
//        System.out.println(sum);
//    }
    }
}
