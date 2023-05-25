package com.solve;

import java.util.ArrayList;
import java.util.Scanner;


class Main24 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);
        for (int i=1; i<n-1; i++){
            answer.add(answer.get(i)+answer.get(i-1));
        }
        return answer;
    }


    public static void main(String[] args) {
        Main24 T = new Main24();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        for (int x: T.solution(n)){
            System.out.print(x+" ");
        }

    }
}