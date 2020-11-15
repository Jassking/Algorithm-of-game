package cn.ty.e_reflect;
//反射获取成员方法
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PersonDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取Person的类信息
        Class cla = Class.forName("cn.ty.e_reflect.Person");
        //2.获取字段信息
        System.out.println(Arrays.toString(cla.getMethods()));
        System.out.println(Arrays.toString(cla.getDeclaredMethods()));
        //3.通过反射创建对象
        Object o = cla.getConstructor().newInstance();
        Method methods6s = cla.getDeclaredMethod("num11", int.class);
        methods6s.invoke(o,10);

        Method methods6 = cla.getDeclaredMethod("num4", int.class);
        methods6.setAccessible(true);

        methods6s.invoke(o,100);
    }
}
