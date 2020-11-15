package cn.ty.e_reflect;
//�����ȡ��Ա����
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class PersonDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //1.��ȡPerson������Ϣ
        Class cla = Class.forName("cn.ty.e_reflect.Person");
        //2.��ȡ�ֶ���Ϣ
        System.out.println(Arrays.toString(cla.getFields()));
        System.out.println(Arrays.toString(cla.getDeclaredFields()));
        //3.ͨ�����䴴������
        Object o = cla.getConstructor().newInstance();
        //��Ա������public��
        //4.ͨ�����������Ա����
        Field num4 = cla.getDeclaredField("num4");
        System.out.println(num4.get(o));
        num4.set(o,100);
        Person person=(Person) o;
        System.out.println(person.num4);
        //��Ա������private��
        Field num1 = cla.getDeclaredField("num1");
        //��������˽�еĳ�Ա����ֵ
        num1.setAccessible(true);;//ǿ������Ϊ�ɷ���
        System.out.println(num1.get(o));
        num1.set(o,200);
        Person person1=(Person)o;
        System.out.println(person1.getNum1());
    }
}
