package com.solve;

import java.util.Scanner;


class Main64 {

    public int[] solution(int n,int m, int[] arr){
        int[] cache = new int[n];
        //ArrayList<Integer> answer =new ArrayList<>();
        for (int x: arr) {
            int pos =-1;
            for (int i=0; i<n; i++) if (x==cache[i]) pos=i;
            if (pos==-1){
                for (int j=n-1; j>=1; j--){
                    cache[j]=cache[j-1];
                }
                cache[0]=x;
            }else {
                for (int j=pos;j>=1;j--){
                    cache[j]=cache[j-1];
                }
                cache[0]=x;
            }
        }
        return cache;
    }


    public static void main(String[] args) {
        Main64 T = new Main64();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[m];
        for (int i=0; i<m; i++){
            arr[i]= kb.nextInt();
        }
        for (int x: T.solution(n,m,arr)) {
            System.out.print(x+" ");
        }

    }
}

//*********
