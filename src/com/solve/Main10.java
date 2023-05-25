package com.solve;

import java.util.Scanner;


class Main10 {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int[] nx={-1,0,1,0};
        int[] ny={0,1,0,-1};

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                boolean flag = true;
                for (int k =0; k<4; k++){
                    int dx = i+nx[k];
                    int dy = j+ny[k];
                    if (dx>=0&&dx<n&&dy>=0&&dy<n&&arr[dx][dy]>=arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main10 T = new Main10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n,arr));

    }
}
