package cn.lq.b_lq;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(0 + ":" + 0 + ":" + 0);
        } else {
            if (n > 0 && n <= 86399) {
                int hour = n / 3600;
                int minute = (n - hour * 3600) / 60;
                int s = (n - hour * 3600 - minute * 60);
                System.out.println(hour + ":" + minute + ":" + s);
            }
        }
    }
}
