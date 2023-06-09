package com.solve;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main84 {
    //동전 교환
    static int n,m;
    static int[] pm;
    public  void DFS(int L) {
        if (L == m) {
            for (int x: pm)System.out.print(x+" ");
            System.out.println();
        } else {
            for (int i = 0; i <m; i++) {
                pm[i]=i;
                DFS(L+1);
            }
        }

    }



    public static void main(String[] args) {
        Main84 T = new Main84();
        Scanner kb = new Scanner(System.in);
        n= kb.nextInt();
        m= kb.nextInt();
        pm= new int[m];
        T.DFS(0);
    }
}
