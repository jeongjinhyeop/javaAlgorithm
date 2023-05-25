package com.solve;

import java.util.Scanner;


class Main62 {

    public int[] solution(int n, int[] arr){
        //  ArrayList<Integer> answer =new ArrayList<>();
        for (int i =0; i<n-1; i++){//고려안한것: 바퀴돌때마다 하나씩비교덜하는거 xxxxxx
            //비교 덜하는 거 아님
            //아니네 비교 덜하는 게맞는데 맨 앞을 비교를 줄이는게 아니라
            //맨뒤를 비교를 하나씩 덜하는거네
            //왜냐하면 두개씩 비교하면 서 맨 끝까지 비교하면 맨뒤에는 가장 큰수가 배치할 것이기 때문이다.
            //따라서 수정 j<n-1 --> j<n-1-i
            //하나더 i<n -> i<n-1 갯수가 5개면 4번만 비교하면 비교가 완료되기 떄문
            for (int j=0; j<n-1-i; j++){
                if (arr[j]>arr[j+1]){
                    //idx=j;
                    int tmp= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }

        }
        return arr;
    }


    public static void main(String[] args) {
        Main62 T = new Main62();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= kb.nextInt();
        }
        for (int x: T.solution(n,arr)) {
            System.out.print(x+" ");
        }

    }
}
