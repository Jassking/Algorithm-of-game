package cn.lq.b_lq;
/*给定两个仅由大写字母或小写字母组成的字符串(长度介于1到10之间)，它们之间的关系是以下4中情况之一：
　　1：两个字符串长度不等。比如 Beijing 和 Hebei
　　2：两个字符串不仅长度相等，而且相应位置上的字符完全一致(区分大小写)，比如 Beijing 和 Beijing
　　3：两个字符串长度相等，相应位置上的字符仅在不区分大小写的前提下才能达到完全一致（也就是说，它并不满足情况2）。比如 beijing 和 BEIjing
　　4：两个字符串长度相等，但是即使是不区分大小写也不能使这两个字符串一致。比如 Beijing 和 Nanjing
　　编程判断输入的两个字符串之间的关系属于这四类中的哪一类，给出所属的类的编号。*/
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String m = scanner.next();
        if (n.length() != m.length()) {
            System.out.println(1);
        } else if (n.equals(m)) {
            //当该参数与此对象表示相同字符序列的 String 对象时，结果才为 true。
            System.out.println(2);
        } else if (n.equalsIgnoreCase(m)){
            //将此 String 与另一个 String 比较，不考虑大小写。
            //如果两个字符串的长度相同，并且其中的相应字符都相等（忽略大小写），则认为这两个字符串是相等的。
            System.out.println(3);
        }else {
            System.out.println(4);
        }
    }
}
