package cn.example.lqb.cyzs;

public class Main {
    /*
1TB=1024GB
1GB=1024MB
1MB=1024KB
1KB=1024字节

最小公倍数=两数之积/最大公约数

编写程序，判断给定的某个年份是否是闰年。
闰年的判断规则如下：
（1）若某个年份能被4整除但不能被100整除，则是闰年。
（2）若某个年份能被400整除，则也是闰年。
import java.util.Scanner;
class Bissextile{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextln();
        if(year<0||year>3000){
            System.out.println("年份有误！");
        }
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
    }
}

import java.util.Scanner;


 * java判断一个数是不是素数
 *
 * 素数又称质数，是指在一个大于1的自然数中，除了1和本身之外，不能被其他自然数整除的数
    public class PrimeNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);//扫描器，接收控制台输入信息
                int num = sc.nextInt();//接收控制台输入的整数
                if (isPrime(num)) {//调用isPrime()方法
                    System.out.println(num + "是素数");//若isPrime()方法返回true，输出是素数
                } else {
                    System.out.println(num + "不是素数");//若isPrime()方法返回false，输出不是素数
                }
            }
        }
        public static boolean isPrime(int a) {
            boolean flag = true;
            if (a<2) {//素数不小于2
                return false;
            } else {
                for(int i = 2;i<=Math.sqrt(a);i++) {
                    if (a % i == 0) {//若果能被整除则说明不是素数，返回false
                        flag = false;
                        break;
                    }
                }
            }
            return flag;
        }
    }

：7 ^ 2020 mod 1921，其中 A mod B 表示 A 除以 B 的余数
import java.math.BigInteger;

public class A指数计算 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("7");
        BigInteger num2 = new BigInteger("1921");
        BigInteger num3=num1.pow(2020).remainder(num2);
        System.out.println(num3);
    }
}

输入一个字符串，请输出这个字符串包含多少个大写字母，多少个小写字
母，多少个数字。
public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入字符串");
        String string=scanner.next();
        char[]cs=string.toCharArray();
        int yingwen = 0;
        int shuzi = 0;
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                yingwen++;
            }else if (c>='0'&&c<='9') {
                shuzi++;
            }
        }
        int end=cs.length-yingwen-shuzi;
        System.out.println("英文有"+yingwen+"个");
        System.out.println("数字有"+shuzi+"个");
        System.out.println("其他有"+end+"个");
    }

*/
}
