package cn.bs.al;
/*
* 1 3
* 2 2 1*/
import java.util.*;
//һ����һ�һ������ֵ
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();//����ֵ
        int n=scanner.nextInt();//��������
        int count=0;//�������
        int res=0;//��¼��ǰ��ʿ���ܵڼ��������λ��
        int[] num=new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=scanner.nextInt();//ÿֻ������˺�
        }
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
            if (a>=num[i]){
                count++;
                res=i;//��¼��ǰ��ʿ���ܵڼ��������λ��
            }
        }
        int count1=count;//��ʿ���ܻ��ܹ������ӽ��
        int max=count;//��ʿ���ܹ���ʱ��õĽ��
        int res1;//��¼��ǰ��������ʿ����ֵ������
        for (int i = res+1; i < n; i++) {//���ϴλ��ܹ����λ�ÿ�ʼ���´����
            if (count+a<num[i]){
                break;
            }else {
                res1=num[i]-a;//��¼��ǰ��������ʿ����ֵ������
                a+=res1;//����������ֱֵ�Ӽӵ���ʿ����
                count1-=res1;//�۳��������ֵ����Ӧ�ĵĽ��
            }
            if (a>=num[i]){//�����ж���ʿ�Ƿ��ܻ��ܹ���
                count1++;
            }
            max=Math.max(count1,max);//�ж���ӽ��ǰ����ӽ�Һ󣬽�������ĸ����
        }
        System.out.println(max);
    }
}
