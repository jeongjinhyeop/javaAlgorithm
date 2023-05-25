package com.solve;

import java.util.Scanner;


class Main34 {

    public int solution(int n,int[] arr1,int m) {
        int answer =0;
        int sum=0;
        int lt=0;
        for (int rt=0; rt<n; rt++){
            sum+=arr1[rt];
            if (sum==m) {
                answer++;
            }while(sum>=m){
                sum-=arr1[lt++];
                if (sum==m) answer++;
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Main34 T = new Main34();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]= kb.nextInt();
        }
        System.out.print(T.solution(n, arr1, m));

    }
}