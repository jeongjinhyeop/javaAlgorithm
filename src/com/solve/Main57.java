package com.solve;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Main57 {

    public String solution(String str1,String str2){
        String answer ="YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x: str1.toCharArray()) Q.offer(x);
        for (char x: str2.toCharArray()){
            if (Q.contains(x)){
                if (x!=Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";

        return answer;
    }


    public static void main(String[] args) {
        Main57 T = new Main57();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2= kb.next();

        System.out.print(T.solution(str1,str2));


    }
}