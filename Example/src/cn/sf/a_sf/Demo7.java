package cn.sf.a_sf;

/*��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
�������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
n<=39 */
/*쳲��������е�����
F[n]=f[n-1]+f[n-2]
f[1]=1;
f[2]=1;
 * */
public class Demo7 {
    public int Fibonacci(int n) {
        //1.���õݹ鷨
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {/*f[1]=1;  f[2]=1;*/
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);/*F[n]=f[n-1]+f[n-2]*/
    }
}
