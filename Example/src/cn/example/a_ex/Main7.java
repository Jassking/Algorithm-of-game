package cn.example.a_ex;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] nums = new int[t];
        int[] a = new int[t];
        int sum = 0;
        int temp = 0;
        int index = 0;
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < t; j++) {
            nums[j] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            for (int j = i; j <= i; j++) {
                if (a[i] == nums[j]) {
                    continue;
                }
                if (a[i] != nums[j]) {
                    if (nums[j] > a[i]) {
                        sum = nums[j] - a[i];
                        temp = sum;
                        index = i;
                        i = t;
                        break;
                    }
                    if (nums[j] < a[i]) {
                        sum = a[i] - nums[j];
                        temp = sum;
                        index = i;
                        i = t;
                        break;
                    }
                }
            }
        }
        for (int i = t - 1; i >= 0; i--) {
            for (int j = i; j <= i; j++) {
                if (a[i] == nums[j]) {
                    continue;
                }
                if (a[i] != nums[j]) {
                    if (nums[j] > a[i]) {
                        sum = nums[j] - a[i];
                        if (temp == sum) {
                            for (int k = index; k < i; k++) {
                                for (int l = k; l <= k; l++) {
                                    if (nums[l] - a[k] != sum) {
                                        System.out.println("no");
                                        return;
                                    }
                                }
                            }
                            System.out.println("yes");
                            return;
                        } else {
                            System.out.println("no");
                            return;
                        }
                    }
                    if (nums[j] < a[i]) {
                        sum = a[i] - nums[j];
                        if (temp == sum) {
                            for (int k = index; k < i; k++) {
                                for (int l = k; l <= k; l++) {
                                    if (a[k] - nums[l] != sum) {
                                        System.out.println("no");
                                        return;
                                    }
                                }
                            }
                            System.out.println("yes");
                            return;
                        } else {
                            System.out.println("no");
                            return;
                        }
                    }
                }
            }
        }
    }
}
