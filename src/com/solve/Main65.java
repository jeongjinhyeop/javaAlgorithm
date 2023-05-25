package com.solve;

import java.util.Arrays;
import java.util.Scanner;


class Main65 {

    public String solution(int n,int[] arr){
        String answer = "U";
        int[] a=new int[n];
        Arrays.sort(arr);
        for (int i=0; i<n-1; i++){
            if (arr[i]==arr[i+1]) return "D";
        }


        return answer;
    }


    public static void main(String[] args) {
        Main65 T = new Main65();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= kb.nextInt();
        }
        System.out.println(T.solution(n,arr));

    }
}

//왜 런타임이 떴을까 ?
//정렬로도 할수 있다라는걸 알려주는 문제
//정렬 시간복잡도 nlogn
//hashmap이 더빠르긴하대