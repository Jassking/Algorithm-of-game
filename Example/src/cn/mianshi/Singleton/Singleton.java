package cn.mianshi.Singleton;

public class Singleton {
    //����ʽ
//    private static Singleton lanhan;
//    private Singleton(){}
//    public static Singleton getInstance(){
//        if (lanhan==null){
//            lanhan=new Singleton();
//        }
//        return lanhan;
//    }
    //����ʽ
//    private static Singleton ehan = new Singleton();
//    private Singleton() { }
//    public static Singleton getInstance() {
//        return ehan;
//    }
    //˫��У��ģʽ
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
