package cn.lq.a_lq;
/*��������
��������n��ʮ��������������������Ƕ�Ӧ�İ˽�������
�����ʽ
��������ĵ�һ��Ϊһ��������n ��1<=n<=10����
����������n�У�ÿ��һ����0~9����д��ĸA~F��ɵ��ַ�������ʾҪת����ʮ��������������ÿ��ʮ�����������Ȳ�����100000��
�����ʽ
�������n�У�ÿ��Ϊ�����Ӧ�İ˽�����������
������ע�⡿
���������ʮ��������������ǰ��0������012A��
��������İ˽�����Ҳ������ǰ��0��*/
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();//��ʮ������װ��String����
        }

        for (int i = 0; i < n; i++) {
            String strBary = toBary(a[i]);//��String����ת��Ϊ������
            int len = strBary.length();//ת����Ķ����Ƴ���
            if (len % 3 == 1) {//ע��˽�����������������һ�飬����ģ��������3������������ǰ�油��
                strBary = "00" + strBary;
            }
            if (len % 3 == 2) {
                strBary = "0" + strBary;
            }
            String strOctal = toOctal(strBary);//��������ת��Ϊ�˽���
            System.out.println(strOctal);
        }
    }

    //ʮ������ת�������㷨
    private static String toBary(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {//��ȡʮ����������ÿһ���ַ���������ת��Ϊ��Ӧ��������
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
