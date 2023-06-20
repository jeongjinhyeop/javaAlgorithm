package com.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Ed implements Comparable<Ed>{
    public int vex;
    public int cost;
    Ed(int vex,int cost){
        this.vex=vex;
        this.cost=cost;
    }

    @Override
    public int compareTo(Ed o) {
        return this.cost-o.cost;
    }
}
public class Main95 {
    static int n,m;
    static int[] dis;
    static ArrayList<ArrayList<Ed>> graph;

    public void Solution(int v){
        PriorityQueue<Ed> pQ = new PriorityQueue<>();
        pQ.offer(new Ed(v,0));
        dis[v]=0;
        while (!pQ.isEmpty()){
            Ed tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost =tmp.cost;
            if (nowCost>dis[now]) continue;
            for (Ed o: graph.get(now)){
                if (dis[o.vex]>nowCost+o.cost){
                    dis[o.vex]=nowCost+o.cost;
                    pQ.offer(new Ed(o.vex,nowCost));
                }
            }
        }

    }
    public static void main(String[] args){
        Main95 T= new Main95();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph= new ArrayList<ArrayList<Ed>>();
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<Ed>());
        }
        dis= new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        for (int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            int c=kb.nextInt();
            graph.get(a).add(new Ed(b,c));
        }
        T.Solution(1);
        for (int i=2; i<=n; i++){
            if (dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+ " :impossible");
        }
    }
}
