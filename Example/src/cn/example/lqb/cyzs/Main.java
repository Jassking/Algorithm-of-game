package cn.example.lqb.cyzs;

public class Main {
    /*
1TB=1024GB
1GB=1024MB
1MB=1024KB
1KB=1024�ֽ�

��С������=����֮��/���Լ��

��д�����жϸ�����ĳ������Ƿ������ꡣ
������жϹ������£�
��1����ĳ������ܱ�4���������ܱ�100�������������ꡣ
��2����ĳ������ܱ�400��������Ҳ�����ꡣ
import java.util.Scanner;
class Bissextile{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextln();
        if(year<0||year>3000){
            System.out.println("�������");
        }
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"������");
        }else{
            System.out.println(year+"��������");
        }
    }
}

import java.util.Scanner;


 * java�ж�һ�����ǲ�������
 *
 * �����ֳ���������ָ��һ������1����Ȼ���У�����1�ͱ���֮�⣬���ܱ�������Ȼ����������
    public class PrimeNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);//ɨ���������տ���̨������Ϣ
                int num = sc.nextInt();//���տ���̨���������
                if (isPrime(num)) {//����isPrime()����
                    System.out.println(num + "������");//��isPrime()��������true�����������
                } else {
                    System.out.println(num + "��������");//��isPrime()��������false�������������
                }
            }
        }
        public static boolean isPrime(int a) {
            boolean flag = true;
            if (a<2) {//������С��2
                return false;
            } else {
                for(int i = 2;i<=Math.sqrt(a);i++) {
                    if (a % i == 0) {//�����ܱ�������˵����������������false
                        flag = false;
                        break;
                    }
                }
            }
            return flag;
        }
    }

��7 ^ 2020 mod 1921������ A mod B ��ʾ A ���� B ������
import java.math.BigInteger;

public class Aָ������ {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("7");
        BigInteger num2 = new BigInteger("1921");
        BigInteger num3=num1.pow(2020).remainder(num2);
        System.out.println(num3);
    }
}

����һ���ַ��������������ַ����������ٸ���д��ĸ�����ٸ�Сд��
ĸ�����ٸ����֡�
public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("�������ַ���");
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
        System.out.println("Ӣ����"+yingwen+"��");
        System.out.println("������"+shuzi+"��");
        System.out.println("������"+end+"��");
    }

*/
}
