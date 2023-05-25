package com.solve;

import java.util.Scanner;


class Main211 {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max=0;
        for (int i=0; i<n; i++){
            int cnt=0;
            for (int j=0; j<n; j++){
                for (int k =0; k<5; k++)
                    if (arr[i][k]==arr[j][k]){
                        cnt++;
                        break;

                    }

            }
            if (cnt>max){
                max=cnt;
                answer=i+1;
            }
        }

//        for (int i = 0; i < n; i++) {
//            if (maxarr[i] > max) {
//                max = maxarr[i];
//                answer = i+1;

//            }
//        }

        return answer;
    }


    public static void main(String[] args) {
        Main211 T = new Main211();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n,arr));

    }
}

//1.indexoutofbound왜 뜨는지 모르것다  뜨는이유 처음 배열 설정을 int[n][n]으로 했기때문 열은 무조건 5로 고정이라 뒤의 n을 5로 수정하니 해결
//2. 내가 처음에 푼 풀이가 왜 잘못되었나? ,런타임오류도 뜬다.
//3. 배열 값이 같지 않은데 왜 자꾸 같다고 나오지
