package cn.example.d_mianshi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    static int i;

    public static void main(String[] args) {
        int a[]={23,1,5,34,56};
        Arrays.sort(a);
        Scanner scanner=new Scanner(System.in);
        int ans=scanner.nextInt();
        int stat=0;
        int end=a.length-1;
        System.out.println( afs(stat,end,ans,a));
    }
    public static boolean afs(int stat,int end,int ans,int a[]){
        while (stat<=end){
            int mid=(stat+end)/2;
            if (ans>a[mid]){
                stat=mid+1;
            }
            if (ans<a[mid]){
                end=mid-1;
            }
            if (a[mid]==ans){
                return true;
            }
        }
        return false;



//            System.out.println(14^3);



//        try {
//            bad();
//            System.out.print("a");
//        }catch (RuntimeException ex){
//            System.out.print("b");
////            throw new Exception();
//        }catch (Exception ex1){
//            System.out.print("c");
//        }finally {
//            System.out.print("d");
//        }
//        System.out.print("e");


//        System.out.println(i);
//        while (i<0){
//            i--;
//        }
//        System.out.println(i);

//        Integer integer=Integer.valueOf(args[args.length-1]);
//        System.out.println(integer);
//        int i=integer.intValue();
//        if (args.length>1){
//            System.out.println(i);
//        }
//        if (args.length>0){
//            System.out.println(i-1);
//        }else{
//            System.out.println(i-2);
//        }
    }
    public static void bad(){
        throw new RuntimeException();
    }
}
