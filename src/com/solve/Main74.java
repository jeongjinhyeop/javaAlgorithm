package com.solve;

import java.util.Scanner;

//피보나치 수열 (재귀)
class Main74 {
    static int[] fibo;//2단계:재귀함수의 최종값만 한번 계산하는 방식
    //하지만 중복 계산이 생기게된다.
    public int DFS(int n){
        if (fibo[n]>0) return fibo[n]; //3단계:메모리제이션
        if (n==1) return fibo[n]=1;//배열 없는게 1단계
        else if(n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);


    }

    public static void main(String[] args) {
        Main74 T = new Main74();
        Scanner kb = new Scanner(System.in);
        int n= kb.nextInt();
        fibo=new int[n+1];
        T.DFS(n);
        for (int i=0; i<n; i++){
            System.out.print(fibo[i]);
        }
    }
}

//for문이 훨씬 효율적 재귀는 메모리도 사용하고 그래서 무겁다.
//for문은 stack 프레임이 하나만 도는것
//재귀함수는 스택프레임이 계속해서 쌓이기 때문에 성능이 상대적으로 떨어짐

//3단계 :메모리제이션
//재귀함수를 호출하며 한번 계산한 값들은 재귀함수를 또 호출하는 것이 아니라
// 배열에 저장하고 참조하여 두번 계산하지 않도록 하는 방식
