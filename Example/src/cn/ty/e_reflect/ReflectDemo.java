package cn.ty.e_reflect;
//反射获取构造方法
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ReflectDemo {
    public ReflectDemo(){}
    public ReflectDemo(String a, int b){
        System.out.println("执行构造方法："+a+","+b);
    }
    private ReflectDemo(String c){}
    protected ReflectDemo(int d){}
    ReflectDemo(boolean e){}

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
       /* //一个类在Java中的对象表示
        //方式1
        Class<Demo01> clazz=Demo01.class;
        //1.获取构造方法
        Constructor<?>[] d=clazz.getConstructors();//获取该类中所有public属性的构造方法
        System.out.println(Arrays.toString(d));

        Constructor<?> e=clazz.getConstructor(String.class ,int.class);//获取该类中指定参数的public属性的构造方法
        System.out.println(e);

        //调用构造方法，创建Demo01对象
        Object object=e.newInstance("国际化",100);
        System.out.println(object instanceof Demo01);*/

        //一个类在Java中的对象表示
        //方式2
        //出现java.lang.ClassNotFoundException错误时，是没有完整的包名+类名，例如：cn.ty.e_reflect.ReflectDemo
        Class cla = Class.forName("cn.ty.e_reflect.ReflectDemo");
        //1.获取构造方法
        Constructor<?>[] d=cla.getConstructors();//获取该类中所有public属性的构造方法
        System.out.println(Arrays.toString(d));

        Constructor e=cla.getConstructor(String.class ,int.class);//获取该类中指定参数的public属性的构造方法
        System.out.println(e);

        //2.调用构造方法，创建Demo01对象
        Object object=e.newInstance("国际化",100);
        System.out.println(object instanceof ReflectDemo);
    }
}
