package cn.example.c_lk.a;

/*���ɾ���n&(n-1)���ܼ���n��һ��1����7&6=��0111��&��0110��=��0110����9&8=(1001)&(1000)=(1000) ,
�Ӷ����ƵĽǶ������Ļ���n�൱����n-1�����λ����1��
*/
public class Main23 {
    public static void main(String[] args) {
        System.out.println(countOnes(32));
    }
    public static int countOnes(int num) {
        int pow = 0;//��¼1�ĸ���
        while (num!=0) {
            num = num & (num - 1);//ÿ����һ�Σ����м�1
            pow++;
        }
        return pow;
    }
}
