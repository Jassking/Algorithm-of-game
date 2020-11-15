package cn.example.d_mianshi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {



//    public static void main(String[] args) {
//        int a,b,c;
//        a=7;
//        b=++a;
//        c=b++;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }


//    public static void main(String[] args) {
//        String s="tommy";
//        Object o=s;
//        sayHello(o);
//        sayHello(s);
//    }
//    public static void sayHello(String to){
//        System.out.println(String.format("Hello,%s",to));
//    }
//    public static void sayHello(Object to){
//        System.out.println(String.format("Welcome,%s",to));
//    }


//    public static void main(String[] args) {
//        String s="a";
//        String sc="a";
//        System.out.println(s.equals(sc));
//        System.out.println(s==sc);
//    }



//    private String name;
//    private int age;
//
//    public Main1(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Main1() {
//    }
//
//    public static void main(String[] args)throws Exception {
//        Class clazz=Main1.class;
//        Main1 o = (Main1) clazz.newInstance();
//        System.out.println(o==null?false:true);
//    }

    //    public int get(){
//        System.out.println("Supper");
//        return 5;
//    }
//
//    public static class Sub{
//        public int get(){
//            System.out.println("Sup");
//            return new Integer("5");
//        }
//    }
//
//    public static void main(String[] args) {
//        new Main1().get();
//        new Sub().get();
//        System.out.println(new Main1().get());
//        System.out.println(new Sub().get());
//    }



//    public static void main(String[] args) {
//        int a[]=new int[4];
//        List<Integer> list=new ArrayList<>();
//        list.size();
//        Map<Integer,Integer> map=new HashMap<>();
//        map.size();
//        boolean b=true?false:true==true?false:true;
//        System.out.println(b);
//    }


//    public static void main(String sgf[]) {
//
//        StringBuffer a=new StringBuffer("¡°A¡±");
//
//        StringBuffer b=new StringBuffer("¡°B¡±");
//
//        operate(a,b);
//        System.out.println(a+"¡±.¡±"+b);
//    }
//    static void operate(StringBuffer x,StringBuffer y) {
//        x.append(y);
//        y=x;
//    }

//    static class X{
//        Y y=new Y();
//        public X(){
//            System.out.print("X");
//        }
//    }
//    static class Y{
//        public Y(){
//            System.out.print("Y");
//        }
//    }
//    public static class Z extends X{
//        Y y=new Y();
//        public Z(){
//            System.out.print("Z");
//        }
//        public static void main(String[] args) {
//            new Z();
//        }
//    }


//    public static void main(String[] args) {
//        String s="as";
//        String t="as";
//        char[] c={'a','s'};
//        System.out.println(t.equals(c));
//    }



//    static void method(){}
//    public static class NameList
//    {
//        private List names = new ArrayList();
//        public synchronized void add(String name)
//        {
//            names.add(name);
//        }
//        public synchronized void printAll()     {
//            for (int i = 0; i < names.size(); i++)
//            {
//                System.out.print(names.get(i) + "");
//            }
//        }
//
//        public static void main(String[]args)
//        {
//            Main1.method();
//            final NameList sl = new NameList();
//            for (int i = 0; i < 2; i++)
//            {
//                new Thread()
//                {
//                    public void run()
//                    {
//                        sl.add("a");
//                        sl.add("b");
//                        sl.add("c");
//                        sl.printAll();
//                    }
//                } .start();
//            }
//        }
//    }





//    public void example(){}
//    public void example(int m){}
////    public int  example(){return 1;}
//    public void example2(){}
//    public int example(int m,float f){
//        return 1;
//    }



//    public static void main(String args[]) {
//        int num = 10;
//        System.out.println(test(num));
//
//    }
//
//    public static int test(int b) {
//        try {
//            b += 10;
//            return b;
//        } catch (RuntimeException e) {
//        } catch (Exception e2) {
//        } finally {
//            b += 10;
//            return b;
//        }
//    }
}

//    public static void main(String[] args) {
//        List Listlist1 = new ArrayList();
//        Listlist1.add(0);
//        List Listlist2 = Listlist1;
//        System.out.println(Listlist1.get(0) instanceof Integer);
//        System.out.println(Listlist2.get(0) instanceof Integer);


//        ArrayList list=new ArrayList();
//        list.add(5);
//        list.add(3);
//        list.add(1);
//        list.add(0,4);
//
//        System.out.println(list.toString());
//class Car extends Vehicle
//{
//    public static void main (String[] args)
//    {
//        new  Car().run();
//    }
//    private final void run()
//    {
//        System. out. println ("Car");
//    }
//}
//class Vehicle
//{
//    private final void run()
//    {
//        System. out. println("Vehicle");
//    }
//}
