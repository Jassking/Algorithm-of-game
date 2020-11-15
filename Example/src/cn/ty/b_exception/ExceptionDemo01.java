package cn.ty.b_exception;
/*
在Person类的构造方法中，进行年龄范围的判断。如果为负数或者大于200岁，抛出InvalidAgeException异常，提示“年龄值非法”。
 */
public class ExceptionDemo01 {
    private String name;
    private int age;

    public ExceptionDemo01() {
    }

    public ExceptionDemo01(String name, int age) {
        InvalidAgeException invalidAgeException=new InvalidAgeException();
        invalidAgeException.setMinAge(0);
        invalidAgeException.setMaxAge(200);
        this.name = name;
        try {
            if (age < invalidAgeException.getMinAge() || age > invalidAgeException.getMaxAge()) {
                throw new InvalidAgeException();
            }
            this.age = age;
        } catch (InvalidAgeException e) {
            System.out.println("出错：" + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ExceptionDemo01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
