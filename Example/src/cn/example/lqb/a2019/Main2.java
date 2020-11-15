package cn.example.lqb.a2019;

/*
4.数的分解：

    把2019 分解成3 个各不相同的正整数之和，并且要求每个正整数都不包
    含数字2 和4，一共有多少种不同的分解方法？
    注意交换3 个整数的顺序被视为同一种方法，例如1000+1001+18 和
    1001+1000+18 被视为同一种。
*/
public class Main2 {
    static int[] a = new int[2019 + 1];
    public static void main(String[] args) {
        int n = 2019;
        //初始化处理1-2019的数字，如果数字标记为1，则有
        for(int i = 1; i < a.length; i++) {
            a[i] = 1;
            char[] s = String.valueOf(i).toCharArray();
            for(int b = 0; b < s.length; b++) {
                if(s[b] == '2' || s[b] == '4') {
                    a[i] = 0;
                    break;
                }
            }
        }
        int cnt = 0;
        for(int a = 1; a < n / 3 + 1; a++) {
            if(check(a)) {
                for(int b = a + 1; b < n; b++) {
                    if(check(b)) {
                        for(int c = b + 1; c < n; c++) {
                            if(a + b + c > n) {
                                break;
                            }
                            if(check(c)) {
                                if(a + b + c == n) {
                                    cnt++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    //判断i中的数字是否有2 或者4
    private static boolean check(int i) {
        if(a[i] == 1) {
            return true;
        }else {
            return false;
        }
    }
    /*int n = 2019;
		int num = 0;
		for (int i = 1; i < n; i++) {
			if ((i + "").indexOf("2") != -1 || (i + "").indexOf("4") != -1)
				continue;
			for (int j = i + 1; j < n; j++) {
				if ((j + "").indexOf("2") != -1 || (j + "").indexOf("4") != -1)
					continue;
				int k = n - i - j;
				if (i == k || j == k || i == j)
					continue;
				if (k > 0 && (k + "").indexOf("2") == -1 && (k + "").indexOf("4") == -1)
					num++;
			}
		}
		System.out.println(num / 3);*/
}
