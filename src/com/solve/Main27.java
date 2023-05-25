package com.solve;

import java.util.Scanner;


class Main27 {

    public int solution(int n, int[] arr) {
        int answer = 0;
        int[] tmp = new int[n];
        int score= 0;
        for (int i =0; i<arr.length; i++ ){
            if (arr[i]==1){
                score++;
                answer+=score;
            }else{
                score =0;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main27 T = new Main27();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}

