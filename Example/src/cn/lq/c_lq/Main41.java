package cn.lq.c_lq;

import java.util.Scanner;
/*��������
��������һ�����ʣ���ʹ�ÿ������뽫������ʼ��ܡ�
��������������һ���滻���ܵļ����������е�������ĸ������ĸ�������ƫ��3λ���滻�����ġ���a��Ϊd��b��Ϊe��...��w��Ϊz��x��Ϊa��y��Ϊb��z��Ϊc��
�������磬lanqiao����odqtldr��
�����ʽ
��������һ�У�����һ�����ʣ�������ֻ����СдӢ����ĸ��
�����ʽ
�������һ�У���ʾ���ܺ�����ġ�
��������
lanqiao
�������
odqtldr
����������ģ��Լ��
���������������������������е���ĸ����������100��*/
public class Main41 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c=='a'){
                stringBuilder.append("d");
            }else if (c=='b'){
                stringBuilder.append("e");
            }else if (c=='c'){
                stringBuilder.append("f");
            }else if (c=='d'){
                stringBuilder.append("g");
            }else if (c=='e'){
                stringBuilder.append("h");
            }else if (c=='f'){
                stringBuilder.append("i");
            }else if (c=='g'){
                stringBuilder.append("j");
            }else if (c=='h'){
                stringBuilder.append("k");
            }else if (c=='i'){
                stringBuilder.append("l");
            }else if (c=='j'){
                stringBuilder.append("m");
            }else if (c=='k'){
                stringBuilder.append("n");
            }else if (c=='l'){
                stringBuilder.append("o");
            }else if (c=='m'){
                stringBuilder.append("p");
            }else if (c=='n'){
                stringBuilder.append("q");
            }else if (c=='o'){
                stringBuilder.append("r");
            }else if (c=='p'){
                stringBuilder.append("s");
            }else if (c=='q'){
                stringBuilder.append("t");
            }else if (c=='r'){
                stringBuilder.append("u");
            }else if (c=='s'){
                stringBuilder.append("v");
            }else if (c=='t'){
                stringBuilder.append("w");
            }else if (c=='u'){
                stringBuilder.append("x");
            }else if (c=='v'){
                stringBuilder.append("y");
            }else if (c=='w'){
                stringBuilder.append("z");
            }else if (c=='x'){
                stringBuilder.append("a");
            }else if (c=='y'){
                stringBuilder.append("b");
            }else if (c=='z'){
                stringBuilder.append("c");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
