package com.solve;

import java.util.*;


class Main86 {
    //동전 교환
    static int n,m;
    static int[] arr,ch,pm;
    public  void DFS(int L) {
        if (L == m) {
            for (int x: pm)System.out.print(x+" ");
            System.out.println();
        } else {
            for (int i = 0; i <n; i++) {
                if (ch[i]==0) {
                    ch[i]=1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i]=0;
                }
            }
        }

    }



    public static void main(String[] args) {
        Main86 T = new Main86();
        Scanner kb = new Scanner(System.in);
        n= kb.nextInt();
        m= kb.nextInt();
        arr= new int[n];
        ch=new int[n];
        int[] a = new int[m];
        for (int i=0; i<n; i++ ){
            arr[i]=kb.nextInt();
        }
        pm=new int[m];
        T.DFS(0);
    }
}
