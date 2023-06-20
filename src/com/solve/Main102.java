package com.solve;

import java.util.Scanner;

public class Main102 {
    static int[] dy;
    public int Solution(int n){
        dy[1]=2;
        dy[2]=3;
        for (int i=3; i<=n; i++){//n+1로 해도 된다.
            dy[i]=dy[i-2]+dy[i-1];
        }
        return dy[n];
    }


    public static void main(String[] args){
        Main102 T=new Main102();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy= new int[n+1];
        System.out.println(T.Solution(n));
    }
}

