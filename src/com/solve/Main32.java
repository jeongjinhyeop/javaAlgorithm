package com.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Main32 {

    public ArrayList<Integer> solution(int n,int[] arr1,int m,int[] arr2) {
        ArrayList<Integer>  answer = new ArrayList<>();
        int p1=0;
        int p2=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(p1<n&&p2<m){
            if (arr1[p1]==arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            }else if (arr1[p1]<arr2[p2]){
                p1++;
            }else if (arr1[p1]>arr2[p2]){
                p2++;
            }
        }
//        for (int i=0; i<n; i++){
//            for (int j=0; j<m; j++){
//                if (arr1[i]==arr2[j]) {
//                    answer.add(arr1[i]);
//                   answer.sort(Comparator.naturalOrder());
//                }
//            }
//        }


        return answer;
    }


    public static void main(String[] args) {
        Main32 T = new Main32();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]= kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2= new int[m];
        for (int j=0; j<m; j++){
            arr2[j]= kb.nextInt();
        }
        for (int x: T.solution(n, arr1, m, arr2)){
            System.out.print(x+" ");
        }
    }
}
