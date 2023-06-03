package com.solve;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Main712 {
    static  int n,m, answer =0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v){
        if (v==n) answer ++;
        else{
            for (int i=0; i<n; i++){
                if (graph[v][i]==1 && ch[i]==0){
                    ch[i]=1;
                    DFS(i);
                }
            }
        }
    }
    public static void main(String[] args){
        Main712 T = new Main712();
        Scanner kb = new Scanner(System.in);
        n= kb.nextInt();
        m= kb.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for (int i=0; i<m; i++){
            int a= kb.nextInt();
            int b = kb.nextInt();
            graph[a][b]=1;
        }
    }
}
