package com.solve;

import java.util.Scanner;

public class Main73 {
    public int DFS(int n){
        if (n==1) {
            return 1;
        }else {
         return   n * DFS(n - 1);
        }
    }

    public static void main(String[] args){
        Main73 T = new Main73();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.DFS(n));
    }
}
