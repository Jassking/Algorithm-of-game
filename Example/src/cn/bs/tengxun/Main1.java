package cn.bs.tengxun;

import java.util.*;
/*
µÚÒ»Ìâ
2
7
PUSH 1
PUSH 2
TOP
POP
TOP
POP
POP
5
PUSH 1
PUSH 2
SIZE
POP
SIZE*/
/*1
2
-1
2
1*/
/*2
4
0 0
0 1
1 0
1 1
2 2
2 3
3 2
3 3
4
0 0
0 0
0 0
0 0
0 0
0 0
0 0
0 0*/
/*1.414
0.000*/
/*3
1 3 2
3 2 1*/
/*1*/
/*6
add 1
add 2
add 3
peek
poll
peek*/
/*1
2*/
/*4
10 1
10 2
10 3
10 4*/
/*1
2
5
-1*/
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int q = 0;
        for (int i = 0; i < t; i++) {
            q = scanner.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            for (int j = 0; j < q; j++) {
                String b = scanner.next();
                if (b.equals("PUSH")) {
                    list.add(scanner.nextInt());
                }
                if (b.equals("TOP")) {
                    if (!list.isEmpty()&&list.get(0)!=0){
                        System.out.println(list.get(0));
                    } else {
                        System.out.println(-1);
                    }
                }
                if (b.equals("POP")) {
                    if (list.isEmpty()){
                        System.out.println(-1);
                    }else {
                        list.remove(0);
                    }
                }
                if (b.equals("SIZE")) {
                    System.out.println(list.size());
                }
                if (b.equals("CLEAR")) {
                    if (!list.isEmpty()) {
                        for (int k = 0; k < list.size();) {
                           list.remove(k);
                        }
                    }
                }
            }
        }
    }
}
