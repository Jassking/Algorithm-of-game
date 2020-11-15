package cn.sf.a_sf;

/*大家都知道斐波那契数列，现在要求输入一个整数n，
请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39 */
/*斐波那契数列的性质
F[n]=f[n-1]+f[n-2]
f[1]=1;
f[2]=1;
 * */
public class Demo7 {
    public int Fibonacci(int n) {
        //1.采用递归法
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {/*f[1]=1;  f[2]=1;*/
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);/*F[n]=f[n-1]+f[n-2]*/
    }
}
