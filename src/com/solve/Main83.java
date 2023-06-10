package com.solve;

import java.util.Scanner;

public class Main83 {
    static int answer =Integer.MIN_VALUE,n,m;
    static int[] a,b;
    public void DFS(int L,int s,int t){
        if (t>m) return;
        if (L==n){
            answer=Math.max(answer,s);
        }
        else {
             DFS(L+1,s+a[L],t+b[L]);
             DFS(L+1,s,t);
        }
    }

    public static void main(String[] args){
        Main83 T= new Main83();
        Scanner kb= new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        a = new int[n];
        b = new int [m];
        for (int i=0; i<n; i++){
            a[i]= kb.nextInt();
            b[i]= kb.nextInt();
        }
        T.DFS(0,0,0);
        System.out.println(answer);
    }
}
