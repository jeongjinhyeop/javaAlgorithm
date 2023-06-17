package com.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    public int vex;
    public int cost;
    Edge(int vex,int cost){
        this.vex=vex;
        this.cost=cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost-o.cost;
    }
}
public class Main95 {
    static int n,m;
    static int[] dis;
    static ArrayList<ArrayList<Edge>> graph;

    public void Solution(int v){
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v,0));
        dis[v]=0;
        while (!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost =tmp.cost;
            if (nowCost>dis[now]) continue;
            for (Edge o: graph.get(now)){
                if (dis[o.vex]>nowCost+o.cost){
                    dis[o.vex]=nowCost+o.cost;
                    pQ.offer(new Edge(o.vex,nowCost));
                }
            }
        }

    }
    public static void main(String[] args){
        Main95 T= new Main95();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph= new ArrayList<ArrayList<Edge>>();
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<Edge>());
        }
        dis= new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        for (int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            int c=kb.nextInt();
            graph.get(a).add(new Edge(b,c));
        }
        T.Solution(1);
        for (int i=2; i<=n; i++){
            if (dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+ " :impossible");
        }
    }
}
