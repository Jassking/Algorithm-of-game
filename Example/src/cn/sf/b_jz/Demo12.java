package cn.sf.b_jz;

/*
����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
��֤base��exponent��ͬʱΪ0
*/
public class Demo12 {
    public double Power(double base, int exponent) {
        //����1
//        return Math.pow(base,exponent);//Math.pow(base,exponent),baseΪ������exponentΪָ��
        //����2
        double i = 1.0;
        if (base == 0) {//��������Ϊ0����Ϊ0����������Ϊ0
            return 0;
        }
        if (exponent == 0) {//ָ��Ϊ0ʱ����Ϊ1
            return 1;
        }
        if (exponent > 0) {//��ָ��Ϊ����
            for (int j = 0; j < exponent; j++) {//�õ����˵�����ѭ����exponent��
                i = i * base;
            }
        } else {//��ָ��Ϊ����,�Ȱ�����Ϊ����-exponent����ѭ��
            for (int j = 0; j < -exponent; j++) {//�õ����˵�����ѭ����exponent��
                i = i * base;
            }
            i = 1 / i;//���������ֵ������
        }
        return i;
    }
}
