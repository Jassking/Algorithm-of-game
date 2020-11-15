package cn.example.lqb.cyzs;

public class Main2 {
    /*
输入一个字符串，请输出这个字符串包含多少个大写字母，多少个小写字母，多少个数字。
【输入格式】
输入一行包含一个字符串。
【输出格式】
输出三行，每行一个整数，分别表示大写字母、小写字母和数字的个数。
【样例输入】
1+a=Aab
【样例输出】
1
3
1
public class F分类计数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        char[] num = s.toCharArray();
        int upp=0,low=0,nums=0;
        for (char c:num){
            if(Character.isUpperCase(c)){
                ++upp;
            } else if(Character.isLowerCase(c)){
                ++low;
            } else if(Character.isDigit(c)){
                ++nums;
            }
        }
        System.out.println(upp);
        System.out.println(low);
        System.out.println(nums);
    }
}

有一个序列，序列的第一个数是 n，后面的每个数是前一个数整除 2，请输
出这个序列中值为正数的项。
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        while (n != 0) {
            System.out.print(n + " ");
            n = n >> 1L;//等价于/2，位运算相对快一些
        }
    }

在平面上有一些二维的点阵。这些点的编号就像二维数组的编号一样，从上到下依次为第 1 至第 n 行，
从左到右依次为第 1 至第 m 列，每一个点可以用行号和列号来表示。
现在有个人站在第 1 行第 1 列，要走到第 n 行第 m 列。只能向右或者向下走。
注意，如果行号和列数都是偶数，不能走入这一格中。
问有多少种方案。
【输入格式】
输入一行包含两个整数 n, m。
【输出格式】
输出一个整数，表示答案。
【样例输入】
3 4
【样例输出】
2
【样例输入】
6 6
【样例输出】
0

public class H走方格 {
    public static void main(String[] args) {
        //输入矩阵的宽高
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int[][] dp = new int[n][m];
        dp[0][0]=1;
        //这个规律是只能往右下走，也就是只能取左上的值
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //第一行一列无需处理
                 if(i==0 && j==0){
                     continue;
                 }
                 //只要不是第一行就可以取上面的
                 if(i>0){
                     dp[i][j]+=dp[i-1][j];
                 }
                 //只要不是第一列就可以取左面的
                 if(j>0){

                     dp[i][j]+=dp[i][j-1];
                 }
                 //如果是偶数行列不能取值，这里是奇数，因为我的是从0开始，所以偶数的就变成了奇数
                 if((i&1)==1 && (j&1)==1){
                     dp[i][j]=0;
                 }
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
}

*/
}
