package com.solve;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


class Main45 {

    public int solution(int n,int m,int[] arr) {
        int answer =-1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());//내림차순 정렬
        for (int i=0; i<n; i++){
            for (int j =i+1; j<n; j++){
                for (int k=j+1; k<n; k++){
                    Tset.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int cnt=0;
        for (int x: Tset){
            cnt++;
            if (cnt==m) return x;
        }
        return answer;
    }


    public static void main(String[] args) {
        Main45 T = new Main45();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr =new int[n];
        for (int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n,m,arr));

    }
}
