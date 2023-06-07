package com.solve;


import java.util.*;


class Main82 {

    static int answer=Integer.MIN_VALUE,c,n;
    public  void DFS(int L,int sum,int[] arr){
        for (int i=0; i<arr.length; i++)
            if(sum>c) return;
        if (L==n){
            answer=Math.max(answer,sum);
        }
        else{
            DFS(L+1,sum+arr[L],arr);
            DFS(L+1,sum,arr);
        }
    }





    public static void main(String[] args) {
        Main82 T = new Main82();
        Scanner kb = new Scanner(System.in);
        c= kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
