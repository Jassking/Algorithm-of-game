package cn.example.lqb.cyzs;

public class Main1 {
    /*
���磬���ַ��� YeRi ���ܿɵ��ַ��� EaFn��
С����һ��������ַ��������ܺ�Ϊ
EaFnjISplhFviDhwFbEjRjfIBBkRyY
���� 30 ����СдӢ����ĸ��ɣ����������з���������ԭ�ַ����Ƕ��٣�
�������������ַ����ͱ���Ƶ��ı��ļ��У�����ؼ�鸴�Ƶ�����
�Ƿ����ĵ��е�һ�¡�������Ŀ¼����һ���ļ� str.txt����һ��Ϊ������ַ�
�������� 52 ������Ϊ����е����ݡ���
public class B���� {
    public static void main(String[] args) {
        HashMap<Character,Character> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<52;i++){
            char a = sc.next().trim().charAt(0);
            char b = sc.next().trim().charAt(0);
            map.put(b,a);
        }
        String s = sc.next();
        char[] num = s.toCharArray();
        for (char c:num){
            System.out.print(map.get(c));
        }
    }
}

С��Ҫ��һ���ܲ�ѵ����
��ʼʱ��С����������������ֵ��Ϊ 10000�����С���ܲ���ÿ�������
600 �����������С����Ϣ��ÿ�������� 300 ����������������ĺ����Ӷ���
���ȱ仯�ġ�
С��������һ���ӡ���Ϣһ���ӡ�����һ���ӡ�����Ϣһ���ӡ������ѭ
�������ĳ��ʱ��С������������ 0������ֹͣ������
����С���ڶ�ú�ֹͣ������Ϊ��ʹ��Ϊ������������Ϊ��λ����𰸡�
����ֻ��д��������д��λ��
public class C�ܲ�ѵ�� {
    public static void main(String[] args) {
        int target = 10000;
        int count = 0;
        boolean flag = true;
        while (true) {
            //���С��600����������Ҫ�ܲ���֤����һ�����ܲ���
            if (target < 600 && flag){
                break;
            }
            if (flag) {
                target -= 600;
                flag = false;
            } else {
                target += 300;
                flag = true;
            }
            count++;
        }
//        System.out.println(count);
        //���Ҫ��������һ���ӻ���600������һ�뻨��10������������10����ʣ�µ��ܲ�ʱ��
        int time = count * 60+target/10;
        System.out.println(time);
    }
}

���� prog.txt ����һ����ĳ������д�ĳ���
���� REPEAT k ��ʾһ������Ϊ k ��ѭ����ѭ�����Ƶķ�Χ��������
�Ӵ��п�ʼ�����������ȸ��ж�ģ�ǰ��Ŀհ׸����ģ�Ϊѭ�����������ݡ�
��������Ƭ�Σ�
Javaʵ�ֵ�ʮһ�����ű� ʡ�����⣨ϣ���ܺ͸�λ������һ�������㷨�⣺����Ⱥ��99979568��_��2��ͼƬ
A = A + 4 ���ڵ��е� A = A + 8 ���ڵ��ж��ڵ�һ�е�
ѭ�������С�
REPEAT 6: ���ڵ��е� A = A + 7 ���ڵ��ж��� REPEAT 5: ѭ���С�
A = A + 5 ʵ���ܹ���ѭ�������� 2 �� 5 �� 6 = 60 �Ρ�
���ʸó���ִ�����֮��A ��ֵ�Ƕ��٣�
public class E_REPEAT���� {
    public static void main(String[] args) {
        int A=0;
        for (int i=0;i<2;i++){
            A+=4;
            for (int j=0;j<5;j++){
                for (int k=0;k<6;k++){
                    A+=5;
                }
                A+=7;
            }
            A+=8;
        }
        A+=9;
        System.out.println(A);
    }
}






*/
}
