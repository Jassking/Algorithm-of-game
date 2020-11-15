package cn.lq.a_lq;
/*
杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。　
下面给出了杨辉三角形的前4行：　
   1　
  1 1　
 1 2 1
1 3 3 1
给出n，输出它的前n行。
*/
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];//几行几列
        for (int i = 0; i < n; i++) {
            //列出两边的1
            a[i][0] = 1;
            a[i][i] = 1;
            //三角形中的每个数字等于它两肩上的数字相加。
            for (int j = 0; j < i; j++) {
                a[i][j+1]=a[i-1][j]+a[i-1][j+1];
            }
        }
        for (int i = 0; i < n; i++) {//0,1,2,3行
            for (int j = 0; j <=i; j++) {//因为a数组是n行n列的，j必须等于i(0,1,2,3)
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
