package cn.example.c_lk.a;

/*规律就是n&(n-1)就能减少n的一个1，比7&6=（0111）&（0110）=（0110），9&8=(1001)&(1000)=(1000) ,
从二进制的角度来看的话，n相当于在n-1的最低位加上1，
*/
public class Main23 {
    public static void main(String[] args) {
        System.out.println(countOnes(32));
    }
    public static int countOnes(int num) {
        int pow = 0;//记录1的个数
        while (num!=0) {
            num = num & (num - 1);//每运行一次，进行减1
            pow++;
        }
        return pow;
    }
}
