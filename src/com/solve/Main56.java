package com.solve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Main56 {

    public int solution(int n, int m){
        int answer =0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i=1; i<=n; i++) {
            Q.offer(i);
        }
        while(!Q.isEmpty()){
            for (int i=1; i<m; i++) {
                Q.offer(Q.poll());
            }
            Q.poll();
            if (Q.size()==1) answer=Q.poll();

        }


        return answer;
    }


    public static void main(String[] args) {
        Main56 T = new Main56();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        System.out.print(T.solution(n,m));


    }
}