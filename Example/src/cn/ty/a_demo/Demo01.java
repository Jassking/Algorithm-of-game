package cn.ty.a_demo;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(Exception());
    }
    public static int Exception(){
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            a=30;
            return a;
        }finally {
            a=40;
            System.out.println("finally");
        }
        return a;
    }
}
