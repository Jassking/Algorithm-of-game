package cn.example.lqb.b2018;

import java.math.BigInteger;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//���⣺��־ͳ��
//С��ά����һ������Ա��̳���������ռ���һ��"����"��־����־����N�С�����ÿһ�еĸ�ʽ�ǣ�
//ts id
//��ʾ��tsʱ�̱��id�������յ�һ��"��"��
//����С����ͳ������Щ����������"����"�����һ��������������һ������ΪD��ʱ������յ�������K���ޣ�С������Ϊ�����������"����"��
//������˵���������ĳ��ʱ��T���������[T, T+D)���ʱ����(ע��������ҿ�����)�յ�������K���ޣ�����������"����"��
//������־���������С��ͳ�Ƴ���������"����"�����ӱ�š�
//
//
//
//�������ʽ��
//
//��һ�а�����������N��D��K��
//����N��ÿ��һ����־��������������ts��id��
//
//����50%�����ݣ�1 <= K <= N <= 1000
//����100%�����ݣ�1 <= K <= N <= 100000 0 <= ts <= 100000 0 <= id <= 100000
//
//�������ʽ��
//����С�����˳���������id��ÿ��idһ�С�
//
//
//������������
//
//7 10 2
//0 1
//0 10
//10 10
//10 1
//9 1
//100 3
//100 3
//
//�����������
//1
//3
//��ԴԼ����
//��ֵ�ڴ����ģ���������� < 256M
//CPU����  < 1000ms
//���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

public class Main6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int k = in.nextInt();

        ArrayList<Node> list = new ArrayList<>();//����Ϊ����
        HashSet<Integer> set = new HashSet<>();//����
        HashMap<Integer, Integer> map = new HashMap<>();//Ϊʲô��map,��Ϊ��ʵ10W��id��û��ȫ����

        for(int i=0;i<n;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            map.put(b, 0);
            list.add(new Node(a,b));
        }
        Collections.sort(list);

        int min=list.get(0).t,max = list.get(0).t,i=0,j=0;
        while(j<n) {//˫ָ��
            Node u = list.get(j);
            max = u.t;
            map.put(u.id, map.get(u.id)+1);
            while(max-min>=10){
                Node v = list.get(i);
                map.put(v.id, map.get(v.id)-1);
                i++;
                min = list.get(i).t;
            }
            if(map.get(u.id)>=k)
                set.add(u.id);
            j++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x:set)
            ans.add(x);
        Collections.sort(ans);
        for(int x:ans)
            System.out.println(x);
    }

    static class Node implements Comparable<Node>{
        int t,id;
        public Node(int t,int id) {
            this.t= t;
            this.id = id;
        }
        @Override
        public int compareTo(Node o) {
            return this.t - o.t;
        }
    }
}
