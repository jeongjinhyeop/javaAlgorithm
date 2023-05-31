package com.solve;

import java.util.Scanner;

//이진수 출력
public class Main72 {
    public void DFS(int n){
        if (n==0) {
            return;
        }else {
            System.out.print(n / 2 + " ");
            DFS(n / 2);
            System.out.print(n % 2 + " ");
        }
    }

    public static void main(String[] agrs){
        Main72 T = new Main72();
        Scanner kb= new Scanner(System.in);
        int n= kb.nextInt();
        T.DFS(n);
    }

}
