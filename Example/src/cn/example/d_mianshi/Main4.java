package cn.example.d_mianshi;


public class Main4 {
    /*isSame的值是false
    isSame2的值是true
    1.isSame中用User类new出来的，User类中没有重写equals方法，所以调用的Object的equals方法，
    其比较的是引用是否相等，user1和user2都是new出来的，引用的地址就不一样。
    2.isSame2中user1.name时使用了String,调用的是String重写的equals，所以比较的是其中的内容是否一致。

    */
    public String name;

    public Main4(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Main4 user1 = new Main4("小王");
        Main4 user2 = new Main4("小王");
        boolean isSame = user1.equals(user2);
        boolean isSame2 = user1.name.equals(user2.name);
        System.out.println(isSame);
    }
}
