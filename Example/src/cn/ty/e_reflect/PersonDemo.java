package cn.ty.e_reflect;
//反射获取成员变量
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class PersonDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //1.获取Person的类信息
        Class cla = Class.forName("cn.ty.e_reflect.Person");
        //2.获取字段信息
        System.out.println(Arrays.toString(cla.getFields()));
        System.out.println(Arrays.toString(cla.getDeclaredFields()));
        //3.通过反射创建对象
        Object o = cla.getConstructor().newInstance();
        //成员变量（public）
        //4.通过对象操作成员变量
        Field num4 = cla.getDeclaredField("num4");
        System.out.println(num4.get(o));
        num4.set(o,100);
        Person person=(Person) o;
        System.out.println(person.num4);
        //成员变量（private）
        Field num1 = cla.getDeclaredField("num1");
        //暴力设置私有的成员变量值
        num1.setAccessible(true);;//强行设置为可访问
        System.out.println(num1.get(o));
        num1.set(o,200);
        Person person1=(Person)o;
        System.out.println(person1.getNum1());
    }
}
