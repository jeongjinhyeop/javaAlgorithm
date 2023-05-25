package com.solve;

import java.util.Scanner;


class Main29 {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int sum1,sum2;
        for (int i =0; i<n; i++){
            sum1=sum2=0;
            for (int j =0; j<n; j++){//Math.max(파라미터 1, 파라미터 2): 인자1과 인자2 중 큰 값을 리턴
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer,sum1);
            answer=Math.max(answer,sum2);
        }
        sum1=sum2=0;
        for (int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-1-i];
        }
        answer=Math.max(answer,sum1);
        answer=Math.max(answer,sum2);

        return answer;
    }


    public static void main(String[] args) {
        Main29 T = new Main29();
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
