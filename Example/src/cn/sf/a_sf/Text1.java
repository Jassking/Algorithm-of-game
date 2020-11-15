package cn.sf.a_sf;

//22
//34
//17
public class Text1 {
    public static Text1 t1 = new Text1();

    {
        System.out.println("blockA");
    }

    static {
        System.out.println("blockB");
    }

    public static void main(String[] args) {
        Text1 t2 = new Text1();
    }

}

