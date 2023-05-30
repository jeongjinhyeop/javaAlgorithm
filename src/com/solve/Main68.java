package com.solve;

import java.util.Arrays;
import java.util.Scanner;

//순차검색
class Main68 {
    public int solution(int n, int m,int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            if (arr[i]==m){
                answer=i+1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main68 T = new Main68();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();

        }
        System.out.println(T.solution(n,m,arr));
    }
}

//내가 한 방식은 순차 검색 시간복잡도:O(n)
