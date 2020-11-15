package cn.mianshi.Singleton;

public class Singleton {
    //懒汉式
//    private static Singleton lanhan;
//    private Singleton(){}
//    public static Singleton getInstance(){
//        if (lanhan==null){
//            lanhan=new Singleton();
//        }
//        return lanhan;
//    }
    //饿汉式
//    private static Singleton ehan = new Singleton();
//    private Singleton() { }
//    public static Singleton getInstance() {
//        return ehan;
//    }
    //双重校验模式
    private static Singleton shuangchong;
    private Singleton(){}
    public static Singleton getInstance(){
        if (shuangchong==null){
            synchronized(Singleton.class){
                if (shuangchong==null){
                    shuangchong=new Singleton();
                }
            }
        }
        return shuangchong;
    }
}
