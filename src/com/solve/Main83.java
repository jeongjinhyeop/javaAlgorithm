package com.solve;

import java.util.Scanner;

public class Main83 {
    static int answer =Integer.MIN_VALUE,n,m;

    public void DFS(int L,int s,int t,int[] a,int[] b){
        if (t>m) return;
        if (L==n){
            answer=Math.max(answer,s);
        }
        else {
             DFS(L+1,s+a[L],t+b[L],a,b);
             DFS(L+1,s,t,a,b);
        }
    }

    public static void main(String[] args){
        Main83 T= new Main83();
        Scanner kb= new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int [m];
        for (int i=0; i<n; i++){
            a[i]= kb.nextInt();
            b[i]= kb.nextInt();
        }
        T.DFS(0,0,0,a,b);
        System.out.println(answer);
    }
}
