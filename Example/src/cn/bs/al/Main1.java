package cn.bs.al;
/*
* 1 3
* 2 2 1*/
import java.util.*;
//一个金币换一个能力值
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();//能力值
        int n=scanner.nextInt();//怪物数量
        int count=0;//金币数量
        int res=0;//记录当前勇士击败第几个怪物的位置
        int[] num=new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=scanner.nextInt();//每只怪物的伤害
        }
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
            if (a>=num[i]){
                count++;
                res=i;//记录当前勇士击败第几个怪物的位置
            }
        }
        int count1=count;//勇士不能击败怪物后相加金币
        int max=count;//勇士击败怪物时获得的金币
        int res1;//记录当前怪物与勇士能力值相差多少
        for (int i = res+1; i < n; i++) {//从上次击败怪物的位置开始重新打怪物
            if (count+a<num[i]){
                break;
            }else {
                res1=num[i]-a;//记录当前怪物与勇士能力值相差多少
                a+=res1;//将相差的能力值直接加到勇士身上
                count1-=res1;//扣除相差能力值所对应的的金币
            }
            if (a>=num[i]){//重新判断勇士是否能击败怪物
                count1++;
            }
            max=Math.max(count1,max);//判断相加金币前和相加金币后，金币数量哪个最大
        }
        System.out.println(max);
    }
}
