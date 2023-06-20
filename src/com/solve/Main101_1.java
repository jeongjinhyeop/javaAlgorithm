package com.solve;

import java.util.*;


class Main101_1 {
    static int[] fibo;

    public int Solution(int n){
        if (fibo[n]>0) return fibo[n];
        else return fibo[n]=Solution(n-2)+Solution(n-1);
    }
    public static void main(String[] args) {
        Main101_1 T = new Main101_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        fibo=new int[n+1];
        fibo[1]=1;
        fibo[2]=2;
        System.out.println(T.Solution(n));
    }
}

