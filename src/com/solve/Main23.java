package com.solve;

import java.util.ArrayList;
import java.util.Scanner;


class Main23 {
    public ArrayList<String> solution(int n, int[] arr1, int[] arr2) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i =0; i<n; i++){
            if (arr1[i]==arr2[i]){
                answer.add("D");

            }else if (arr1[i]==1 && arr2[i]==2){
                answer.add("B");
            }else if (arr1[i]==1 && arr2[i]==3){
                answer.add("A");
            }else if (arr1[i]==2 && arr2[i]==1){
                answer.add("A");
            }else if (arr1[i]==2 && arr2[i]==3){
                answer.add("B");
            }else if (arr1[i]==3 && arr2[i]==1){
                answer.add("B");
            }else if (arr1[i]==3 && arr2[i]==2){
                answer.add("A");
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Main23 T = new Main23();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i =0; i<n; i++){
            arr1[i] = kb.nextInt();

        }
        for (int i =0; i<n; i++){
            arr2[i] = kb.nextInt();

        }

        for (String str: T.solution(n,arr1,arr2)){
            System.out.println(str);
        }

    }
}