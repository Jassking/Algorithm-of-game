package cn.ty.e_reflect;
//�����ȡ���췽��
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ReflectDemo {
    public ReflectDemo(){}
    public ReflectDemo(String a, int b){
        System.out.println("ִ�й��췽����"+a+","+b);
    }
    private ReflectDemo(String c){}
    protected ReflectDemo(int d){}
    ReflectDemo(boolean e){}

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
       /* //һ������Java�еĶ����ʾ
        //��ʽ1
        Class<Demo01> clazz=Demo01.class;
        //1.��ȡ���췽��
        Constructor<?>[] d=clazz.getConstructors();//��ȡ����������public���ԵĹ��췽��
        System.out.println(Arrays.toString(d));

        Constructor<?> e=clazz.getConstructor(String.class ,int.class);//��ȡ������ָ��������public���ԵĹ��췽��
        System.out.println(e);

        //���ù��췽��������Demo01����
        Object object=e.newInstance("���ʻ�",100);
        System.out.println(object instanceof Demo01);*/

        //һ������Java�еĶ����ʾ
        //��ʽ2
        //����java.lang.ClassNotFoundException����ʱ����û�������İ���+���������磺cn.ty.e_reflect.ReflectDemo
        Class cla = Class.forName("cn.ty.e_reflect.ReflectDemo");
        //1.��ȡ���췽��
        Constructor<?>[] d=cla.getConstructors();//��ȡ����������public���ԵĹ��췽��
        System.out.println(Arrays.toString(d));

        Constructor e=cla.getConstructor(String.class ,int.class);//��ȡ������ָ��������public���ԵĹ��췽��
        System.out.println(e);

        //2.���ù��췽��������Demo01����
        Object object=e.newInstance("���ʻ�",100);
        System.out.println(object instanceof ReflectDemo);
    }
}
