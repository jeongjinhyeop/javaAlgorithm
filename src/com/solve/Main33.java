package com.solve;

import java.util.Scanner;


class Main33 {

    public int solution(int n,int[] arr1,int m) {
        int answer =0;
        int sum=0;
        for (int i=0; i<m; i++){
            sum+=arr1[i];
            answer=sum;
        }
        for (int i=m; i<n; i++){
            sum+=arr1[i]-arr1[i-m];
            answer= Math.max(answer,sum);
        }

//        ArrayList<Integer> a =new ArrayList<>();
//        for (int i=0; i<n-2; i++){
//            for (int j=0; j<n)
//            a.add(arr1[i]+arr1[i+1]+arr1[i+2]);//연속m일 의 합 어떻게?
//        }
//        a.sort(Comparator.reverseOrder());
//        answer=a.get(0);


        return answer;
    }


    public static void main(String[] args) {
        Main33 T = new Main33();
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
