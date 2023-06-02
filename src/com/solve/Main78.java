package com.solve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main78 {
    int[] dis ={1,-1,5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int n, int m){
        ch= new int[10001];
        Q.offer(n);
        ch[n]=1;
        int L=0;
        while (!Q.isEmpty()){
            int len = Q.size();
            for (int i=0; i<len; i++){ //len 이 1인데 int i =1;  i<len 과 계속 맞지 않아 오류남
                int x=Q.poll();

                for (int j=0; j<3; j++) {
                    int nx = dis[j] + x;
                    if (nx==m) return L+1;
                    if (nx>=1 && nx<=10000 && ch[nx]==0) {
                        ch[nx] = 1;  //nx값이 존재하면 ch[nx]==1 로 설정하여 해당값이 존재함을 판단한다.
                        Q.offer(nx);

                    }
                }
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args){
        Main78 T = new Main78();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        System.out.println(T.BFS(n,m));
    }
}
