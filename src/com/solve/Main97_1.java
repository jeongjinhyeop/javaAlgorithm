package com.solve;

import java.util.*;

class E implements Comparable<E>{
    public  int vex;
    public int cost;
    E(int vex,int cost){
        this.vex=vex;
        this.cost=cost;
    }

    @Override
    public int compareTo(E ob) {
        return this.cost-ob.cost;
    }
}
class Main {
    static int answer;
    static int[] ch;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        //인접리스트 생성(다익스트라)
        ArrayList<ArrayList<E>> graph = new ArrayList<ArrayList<E>>();
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<E>());
        }
        ch=new int[n+1];
        for (int i=0; i<m; i++){
            int a= kb.nextInt();
            int b= kb.nextInt();
            int c =kb.nextInt();
            graph.get(a).add(new E(b,c));
            graph.get(b).add(new E(a,c));//무방향이라 두개
        }
        answer=0;
        PriorityQueue<E> pQ =new PriorityQueue<>();
        pQ.offer(new E(1,0));
        while(!pQ.isEmpty()){
            E tmp=pQ.poll();
            int ev =tmp.vex;
            if (ch[ev]==0){
                ch[ev]=1;
                answer+=tmp.cost;
                for (E ob : graph.get(ev)){
                    if (ch[ob.vex]==0) pQ.offer(new E(ob.vex, ob.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
