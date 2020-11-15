package cn.example.a_ex;
import java.util.*;
public class Example {
    public static void main(String[] args) {
        Example main = new Example();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int len = sc.nextInt();
            int[] scores = new int[len];
            for (int i=0;i<len;i++){
                scores[i] = sc.nextInt();
            }
            HashMap<Integer,Integer> scoreMap = main.creatHashmap(scores,len);
            int queryLen = sc.nextInt();
            for (int i = 0;i<queryLen;i++){
                System.out.printf("%.6f\n",main.outputRank(scoreMap,scores,len,sc.nextInt()-1));
            }
        }
    }

    public HashMap<Integer,Integer> creatHashmap(int[] scores,int len){
        int[] copy = Arrays.copyOf(scores,len);
        Arrays.sort(copy);
        HashMap<Integer,Integer> hashpmap = new HashMap<>();
        int count = 0;
        for (int i=0;i<len;i++){
            if (hashpmap.containsKey(copy[i])){
                hashpmap.put(copy[i],hashpmap.get(copy[i])+1);
                count++;
            }
            else{
                count++;
                hashpmap.put(copy[i],count);
            }
        }
        return hashpmap;
    }

    public Double outputRank(HashMap<Integer,Integer> hashMap,int[] scores,int len,int query){
        double ans=0;
        double rank = hashMap.get(scores[query]);
        ans = (rank-1)*100/len;
        return ans;
    }
}
