package cn.lq.b_lq;
/*��1��2019�У��ж��ٸ�������λ�а�������9��
����ע�⣬�е����е���λ�а������9�������ֻ��һ�Ρ����磬1999�������������9���ڼ���ֻ����һ������*/
public class Main28 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 2019; i++) {
            if (String.valueOf(i).contains("9")){
                sum++;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
