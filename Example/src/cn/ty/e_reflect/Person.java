package cn.ty.e_reflect;

class j{
    private int num11;
    protected int num22;
    int num33;
    public int num44;
}

public class Person extends j{
    private int num1;
    protected int num2;
    int num3;
    public int num4;

    public int getNum1() {
        return num1;
    }

    protected void num2(){
        System.out.println("ִ��num2��Ա����");
    }

    void num3(){
        System.out.println("ִ��num3��Ա����");
    }

    private void num4(int s){
        System.out.println("ִ��num4��Ա����"+s);
    }

    public static void num11(int s){
        System.out.println("ִ��num11��Ա����"+s);
    }

}
