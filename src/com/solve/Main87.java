package com.solve;

import java.util.*;

class Main87{
    //동전 교환
    static int n,r,answer;
    static int[][] dy=new int[35][35];
    public int DFS( int n, int r) {
        if (dy[n][r]>0) return dy[n][r];
        if (r==0||n==r) return 1;
        else return dy[n][r]=DFS(n-1,r-1)+DFS(n-1,r);

    }



    public static void main(String[] args) {
        Main87 T = new Main87();
        Scanner kb = new Scanner(System.in);
        n= kb.nextInt();
        r= kb.nextInt();

        System.out.println(T.DFS(n,r));

    }
}



