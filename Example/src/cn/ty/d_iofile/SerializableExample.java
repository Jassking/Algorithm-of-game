package cn.ty.d_iofile;
//序列化和反序列化Serializable
import java.io.*;

class MyClass implements Serializable{
    private static final long serialVersionUID=1L;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SerializableExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ser();
        read();
    }

    private static void ser() throws IOException {
        //序列化过程
        MyClass myClass=new MyClass();
        myClass.setName("张健翔");
        myClass.setAge(21);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("MyClass.dat"));
        objectOutputStream.writeObject(myClass);
        //插入null是用来判断是否读取到结尾
        //写入结束标志方便读取(非常重要，如果不写入，在读取的时候无法定位读取结束) ;
        //读取的时候就会报java. io. EOFException异常
        objectOutputStream.writeObject(null);//判断读取结尾
        objectOutputStream.close();
    }
    private static void read() throws IOException, ClassNotFoundException {
        //反序列化过程
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("MyClass.dat"));
        Object o = objectInputStream.readObject();
        System.out.println(o instanceof MyClass);
        MyClass m=(MyClass) o;
        System.out.println(m);
        objectInputStream.close();
    }
}
