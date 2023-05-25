package com.solve;

import java.util.Scanner;

class Main36 {

    public int solution(int n,int m, int[] arr) {
        int answer =0;
        int cnt =0;
        int lt =0;
        for (int rt=0; rt<n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > m) {
                if (arr[lt++] == 0) cnt--;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }


    public static void main(String[] args) {
        Main36 T = new Main36();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m =kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n,m,arr));

    }
}
