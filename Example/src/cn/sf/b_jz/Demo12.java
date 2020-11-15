package cn.sf.b_jz;

/*
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
保证base和exponent不同时为0
*/
public class Demo12 {
    public double Power(double base, int exponent) {
        //方法1
//        return Math.pow(base,exponent);//Math.pow(base,exponent),base为底数，exponent为指数
        //方法2
        double i = 1.0;
        if (base == 0) {//底数不能为0，若为0，则整个数为0
            return 0;
        }
        if (exponent == 0) {//指数为0时，数为1
            return 1;
        }
        if (exponent > 0) {//若指数为正数
            for (int j = 0; j < exponent; j++) {//让底数乘底数，循环乘exponent次
                i = i * base;
            }
        } else {//若指数为负数,先把他变为正数-exponent，再循环
            for (int j = 0; j < -exponent; j++) {//让底数乘底数，循环乘exponent次
                i = i * base;
            }
            i = 1 / i;//将所求的数值反过来
        }
        return i;
    }
}
