package cn.example.lqb.a2019;

/*
4.���ķֽ⣺

    ��2019 �ֽ��3 ��������ͬ��������֮�ͣ�����Ҫ��ÿ��������������
    ������2 ��4��һ���ж����ֲ�ͬ�ķֽⷽ����
    ע�⽻��3 ��������˳����Ϊͬһ�ַ���������1000+1001+18 ��
    1001+1000+18 ����Ϊͬһ�֡�
*/
public class Main2 {
    static int[] a = new int[2019 + 1];
    public static void main(String[] args) {
        int n = 2019;
        //��ʼ������1-2019�����֣�������ֱ��Ϊ1������
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

    //�ж�i�е������Ƿ���2 ����4
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
