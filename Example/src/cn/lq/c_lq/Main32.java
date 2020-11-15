package cn.lq.c_lq;

import java.util.Scanner;
/*小明有一块空地，他将这块空地划分为 n 行 m 列的小块，每行和每列的长度都为 1。
　　小明选了其中的一些小块空地，种上了草，其他小块仍然保持是空地。
　　这些草长得很快，每个月，草都会向外长出一些，如果一个小块种了草，则它将向自己的上、下、左、右四小块空地扩展，这四小块空地都将变为有草的小块。
　　请告诉小明，k 个月后空地上哪些地方有草。
输入格式
　　输入的第一行包含两个整数 n, m。
　　接下来 n 行，每行包含 m 个字母，表示初始的空地状态，字母之间没有空格。如果为小数点，表示为空地，如果字母为 g，表示种了草。
　　接下来包含一个整数 k。
输出格式
　　输出 n 行，每行包含 m 个字母，表示 k 个月后空地的状态。如果为小数点，表示为空地，如果字母为 g，表示长了草。
样例输入
4 5
.g...
.....
..g..
.....
2
样例输出
gggg.
gggg.
ggggg
.ggg.*/
public class Main32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//行
        int m = scanner.nextInt();//列
        String[] a = new String[n];
        char[][] chars = new char[n][m];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.next();
        }
        int month = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                chars[i][j]=a[i].charAt(j);
            }
        }
        char[][] ca=new char[n][m];
        for (int k = 0; k < month; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (chars[i][j] == 'g') {
                        ca[i][j]='g';
                        if (i - 1 >= 0) {
                            ca[i - 1][j] = 'g';//上
                        }
                        if (i + 1 < n) {
                            ca[i + 1][j] = 'g';//下
                        }
                        if (j - 1 >= 0) {
                            ca[i][j - 1] = 'g';//左
                        }
                        if (j + 1 < m) {
                            ca[i][j + 1] = 'g';//右
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    chars[i][j]=ca[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (chars[i][j]=='g'){
                    System.out.print(chars[i][j]);
                }else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }
}
