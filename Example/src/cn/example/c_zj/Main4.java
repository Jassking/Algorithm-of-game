package cn.example.c_zj;
/*
Z���Ļ���ϵͳ������ֵ1Ԫ��4Ԫ��16Ԫ��64Ԫ����4��Ӳ�ң��Լ���ֵ1024Ԫ��ֽ�ҡ�
����СYʹ��1024Ԫ��ֽ�ҹ�����һ����ֵΪN(0<N��1024)N (0 < N \le 1024)N(0<N��1024)����Ʒ���������������յ�����Ӳ�ң�
��������:
һ�У�����һ����N��
�������:
һ�У�����һ��������ʾ�����յ���Ӳ������
ʾ��1
����
200
���
17
˵��
��200����Ҫ����824�飬��12��64ԪӲ�ң�3��16ԪӲ�ң�2��4ԪӲ�Ҽ��ɡ�
��ע:
����100%�����ݣ�N(0<N��1024)N (0 < N \le 1024)N(0<N��1024)��*/
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=1024-n;
        int q=(sum-sum%64)/64;
        int w=(sum%64-(sum%64)%16)/16;
        int e=((sum%64)%16-((sum%64)%16)%4)/4;
        int r=((sum%64)%16)%4;
        int ans=q+w+e+r;
        System.out.println(ans);
    }
}
