package cn.lq.a_lq;
/*问题描述
　　给定n个十六进制正整数，输出它们对应的八进制数。
输入格式
　　输入的第一行为一个正整数n （1<=n<=10）。
　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
输出格式
　　输出n行，每行为输入对应的八进制正整数。
　　【注意】
　　输入的十六进制数不会有前导0，比如012A。
　　输出的八进制数也不能有前导0。*/
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();//将十六进制装入String数组
        }

        for (int i = 0; i < n; i++) {
            String strBary = toBary(a[i]);//将String数组转化为二进制
            int len = strBary.length();//转化完的二进制长度
            if (len % 3 == 1) {//注意八进制是三个二进制数一组，所以模三，不是3的整数倍的在前面补零
                strBary = "00" + strBary;
            }
            if (len % 3 == 2) {
                strBary = "0" + strBary;
            }
            String strOctal = toOctal(strBary);//将二进制转化为八进制
            System.out.println(strOctal);
        }
    }

    //十六进制转二进制算法
    private static String toBary(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {//截取十六进制数的每一个字符，并将其转换为对应二进制数
                case '0':
                    stringBuffer.append("0000");
                    break;
                case '1':
                    stringBuffer.append("0001");
                    break;
                case '2':
                    stringBuffer.append("0010");
                    break;
                case '3':
                    stringBuffer.append("0011");
                    break;
                case '4':
                    stringBuffer.append("0100");
                    break;
                case '5':
                    stringBuffer.append("0101");
                    break;
                case '6':
                    stringBuffer.append("0110");
                    break;
                case '7':
                    stringBuffer.append("0111");
                    break;
                case '8':
                    stringBuffer.append("1000");
                    break;
                case '9':
                    stringBuffer.append("1001");
                    break;
                case 'A':
                    stringBuffer.append("1010");
                    break;
                case 'B':
                    stringBuffer.append("1011");
                    break;
                case 'C':
                    stringBuffer.append("1100");
                    break;
                case 'D':
                    stringBuffer.append("1101");
                    break;
                case 'E':
                    stringBuffer.append("1110");
                    break;
                case 'F':
                    stringBuffer.append("1111");
                    break;
                default:
                    break;
            }
        }
        return stringBuffer.toString();
    }

    private static String toOctal(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        int k = 0;
        if (s.substring(0, 3).equals("000")) {
            k=3;
        }else {
            k=0;
        }
        for (int i = k; i < s.length(); i += 3) {
            switch (s.substring(i, i + 3)) {
                case "000":
                    stringBuffer.append("0");
                    break;
                case "001":
                    stringBuffer.append("1");
                    break;
                case "010":
                    stringBuffer.append("2");
                    break;
                case "011":
                    stringBuffer.append("3");
                    break;
                case "100":
                    stringBuffer.append("4");
                    break;
                case "101":
                    stringBuffer.append("5");
                    break;
                case "110":
                    stringBuffer.append("6");
                    break;
                case "111":
                    stringBuffer.append("7");
                    break;
                default:
                    break;
            }
        }
        return stringBuffer.toString();
    }
}
