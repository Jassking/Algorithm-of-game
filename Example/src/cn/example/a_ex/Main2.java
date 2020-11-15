package cn.example.a_ex;
/*vivo2020�촺��У԰��Ƹ���߱�̿���*/
/*�ָ������������� n����Ѱ�Ҳ������С�������� m��m>9����ʹ�� m �ĸ�λ����λ��ʮλ����λ ... ...��֮�˻�����n��
������������� -1��
��������1:
36
�������1:
49
��������2:
100
�������2:
455
*/
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();   //��ȡ��ʼʱ��
        doSomeThing();  //���ԵĴ����
        long endTime=System.currentTimeMillis(); //��ȡ����ʱ��
        System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"s");
    }

    private static int doSomeThing() {
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        int solution = solution(s);
        System.out.println(solution);
        return s;
    }

    public static int solution(int n) {
        List<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder append=null;
        if (n < 10){
            return 10 + n;
        }
        while (n >= 10){
            for (int i = 9; i >= 2; i--) {
                if (0 == n % i){
                    list.add(i);
                    n = n / i;
                    break;
                }
                if (2 == i) return -1;
            }
        }
        list.add(n);
        for (int i = 0; i < list.size(); i++) {
            append = stringBuilder.append(list.get(i));
        }
        return Integer.parseInt(append.reverse().toString());
    }
}