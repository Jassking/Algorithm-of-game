package cn.lq.c_lq;
/*�ڰ��⣺��������Է���
С�����ڷ���һ��С˵�е���������ԡ�����֪����С˵�� Alice �� Bob �ж��ٴ�ͬʱ���֡�
��׼ȷ��˵��С������ Alice �� Bob��ͬʱ���֡�����˼�ǣ���С˵�ı� �� Alice �� Bob ֮�䲻���� K ���ַ���
���������ı���
ThisisastoryaboutAliceandBob.AlicewantstosendaprivatemessagetoBob.
���� K = 20���� Alice �� Bob ͬʱ������ 2 �Σ��ֱ��ǡ�Alice and Bob�� �͡�Bob. Alice����
ǰ�� Alice �� Bob ֮���� 5 ���ַ��������� 2 ���ַ���
ע��:
1. Alice �� Bob �Ǵ�Сд���еģ�alice �� bob �Ȳ����������ڡ�
2. Alice �� Bob ӦΪ�����ĵ��ʣ�ǰ������б����źͿո񣬵��ǲ��� ����ĸ������ Bobbi �K��������� Bob
�������ʽ��
��һ�а���һ������ K��
�ڶ��а���һ���ַ�����ֻ������Сд��ĸ�������źͿո񡣳��Ȳ��� �� 1000000��
�������ʽ��
 ���һ����������ʾ Alice �� Bob ͬʱ���ֵĴ�����
���������롿
20
ThisisastoryaboutAliceandBob.AlicewantstosendaprivatemessagetoBob.
�����������
2
������������ģ��Լ����
 ������������������1�� K ��1000000��
ʱ�����ƣ�1.0s
�ڴ����ƣ�512.0MB*/
import java.util.Scanner;

public class Main39 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=scanner.nextLine();
        String[] w=s.split("\\s+|\\.");//ʹ��������ʽ���ַ����ָ���ַ�����
        int ans=0;
        //\\s��ʾ   �ո�,�س�,���еȿհ׷�,
        // +�ű�ʾһ����������˼
        //|��ʾ����
        //\\.��ʾ.
        //split("\\s+|\\.");�����ո�,�س�,���еȿհ׷�,����.ʱ�����зָ�
        for (int i = 0; i < w.length; i++) {
            if (w[i].contains("Alice")){
                for (int j = i+1; j < w.length; j++) {
                    if (w[j].contains("Bob")){
                        int sum=0;
                        for (int k =i+1; k <j ; k++) {//����Alice �� Bob ֮���м����ַ�
                            sum+=w[k].length();
                        }
                        if (sum<n){//�ж�Alice �� Bob ֮�䲻���� K ���ַ�
                            ans++;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < w.length; i++) {
            if (w[i].contains("Bob")){
                for (int j = i+1; j < w.length; j++) {
                    if (w[j].contains("Alice")){
                        int sum=0;
                        for (int k =i+1; k <j ; k++) {
                            sum+=w[k].length();
                        }
                        if (sum<n){
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
