package cn.example.lqb.cyzs;

public class Main2 {
    /*
����һ���ַ��������������ַ����������ٸ���д��ĸ�����ٸ�Сд��ĸ�����ٸ����֡�
�������ʽ��
����һ�а���һ���ַ�����
�������ʽ��
������У�ÿ��һ���������ֱ��ʾ��д��ĸ��Сд��ĸ�����ֵĸ�����
���������롿
1+a=Aab
�����������
1
3
1
public class F������� {
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

��һ�����У����еĵ�һ������ n�������ÿ������ǰһ�������� 2������
�����������ֵΪ�������
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        while (n != 0) {
            System.out.print(n + " ");
            n = n >> 1L;//�ȼ���/2��λ������Կ�һЩ
        }
    }

��ƽ������һЩ��ά�ĵ�����Щ��ı�ž����ά����ı��һ�������ϵ�������Ϊ�� 1 ���� n �У�
����������Ϊ�� 1 ���� m �У�ÿһ����������кź��к�����ʾ��
�����и���վ�ڵ� 1 �е� 1 �У�Ҫ�ߵ��� n �е� m �С�ֻ�����һ��������ߡ�
ע�⣬����кź���������ż��������������һ���С�
���ж����ַ�����
�������ʽ��
����һ�а����������� n, m��
�������ʽ��
���һ����������ʾ�𰸡�
���������롿
3 4
�����������
2
���������롿
6 6
�����������
0

public class H�߷��� {
    public static void main(String[] args) {
        //�������Ŀ��
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int[][] dp = new int[n][m];
        dp[0][0]=1;
        //���������ֻ���������ߣ�Ҳ����ֻ��ȡ���ϵ�ֵ
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //��һ��һ�����账��
                 if(i==0 && j==0){
                     continue;
                 }
                 //ֻҪ���ǵ�һ�оͿ���ȡ�����
                 if(i>0){
                     dp[i][j]+=dp[i-1][j];
                 }
                 //ֻҪ���ǵ�һ�оͿ���ȡ�����
                 if(j>0){

                     dp[i][j]+=dp[i][j-1];
                 }
                 //�����ż�����в���ȡֵ����������������Ϊ�ҵ��Ǵ�0��ʼ������ż���ľͱ��������
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
