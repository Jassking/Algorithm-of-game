package cn.ty.e_reflect;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.类在java中的对象表示
        Class cla=Class.forName("java.util.Scanner");
        //2.获取该类中指定的构造方法
        Constructor constructor = cla.getConstructor(InputStream.class);
        //3.调用构造方法进行创建对象
        Object o = constructor.newInstance(System.in);
        Scanner scanner=(Scanner)o;
        int i = scanner.nextInt();
        System.out.println(i);
    }
}
