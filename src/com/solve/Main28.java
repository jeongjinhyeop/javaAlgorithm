package com.solve;


import java.util.ArrayList;
import java.util.Scanner;


class Main28 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i =0; i<arr.length; i++){
            int cnt = 1;
            for (int j=0; j<arr.length; j++){
                if (arr[i]<arr[j])
                    cnt++;

            }
            answer.add(cnt);
        }


        return answer;
    }


    public static void main(String[] args) {
        Main28 T = new Main28();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x: T.solution(n,arr)){
            System.out.print(x+" ");
        }
    }
}
//직접 더할필요없이 cnt에서 계산 끝내고 answer에 대입하는게 훨씬 편하다.
//오래걸린이유 모든ArrayList에 직접 접근하여 계산하려고 해서 그럼