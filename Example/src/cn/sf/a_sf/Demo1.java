package cn.sf.a_sf;

import java.util.Scanner;

public class Demo1 {

    /*在一个二维数组中（每个一维数组的长度相同），
    每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。*/
    //测试用例
    /*3 3
      1 2 3
      4 5 6
      7 8 9*/
    //方法1：暴力法
    /*
    public boolean Find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }*/
    //方法2：从左上角开始查找
    /*public static boolean Find(int target, int[][] array) {
        int i = 0;
        int j = array.length - 1;
        while (i >= 0 && i < array.length && j >= 0 && j < array[0].length) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }*/
    //方法2：从左上角开始查找
    public static boolean Find(int target, int[][] array) {
        int i = array.length - 1;
        int j = 0;
        while (i >= 0 && i < array.length && j >= 0 && j < array[0].length) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int tar = scanner.nextInt();
        System.out.println(Find(tar, array));
    }

}

