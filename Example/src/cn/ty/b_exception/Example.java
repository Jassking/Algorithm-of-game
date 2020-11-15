package cn.ty.b_exception;
/*
定义Person类，包含name和age两个成员
在Person类的构造方法中，进行年龄范围的判断。如果为负数或者大于200岁，抛出InvalidAgeException异常，提示“年龄值非法”。

并写出测试代码。
 */
/*
测试代码
 */
public class Example {
    public static void main(String[] args) {
        ExceptionDemo01 exceptionDemo01 = new ExceptionDemo01("ghsja", 1000);
        System.out.println(exceptionDemo01);
    }
}
