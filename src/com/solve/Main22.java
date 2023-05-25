package com.solve;

import java.util.Scanner;

class Main22 {
    public int solution(int n, int[] arr) {
        int answer = 1;
        int a = arr[0];
        for (int i=1; i<n; i++ ){
            if (arr[i]>a ){
                a=arr[i];
                answer++;
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Main22 T = new Main22();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arr));


    }
}