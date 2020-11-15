package cn.ty.e_reflect;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.����java�еĶ����ʾ
        Class cla=Class.forName("java.util.Scanner");
        //2.��ȡ������ָ���Ĺ��췽��
        Constructor constructor = cla.getConstructor(InputStream.class);
        //3.���ù��췽�����д�������
        Object o = constructor.newInstance(System.in);
        Scanner scanner=(Scanner)o;
        int i = scanner.nextInt();
        System.out.println(i);
    }
}
