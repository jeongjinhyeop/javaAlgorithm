package com.solve;

import java.util.Scanner;


class Main25 {
    public int solution(int n) {//이중for문으로 가능하긴 한데 시간초과뜰 가능성 높다고 하심
        int answer = 0;  //에라토스테네스 체 방식
        int[] ch= new int[n+1];
        for (int i =1; i<=n; i++){
            if (ch[i]==0){
                answer++;
                for (int j =i; j<=n; j=j+i){
                    ch[j]=1;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main25 T = new Main25();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();

        System.out.print(T.solution(n));


    }
}
