package com.solve;

import java.util.Scanner;
import java.util.Stack;


class Main52 {

    public String solution(String str){
        String answer="";
        Stack<Character> stack = new Stack<>();
        for (char x: str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;//'(' 가 아닐때까지니까 '('까지 pop한다는 뜻
            } else {
                stack.push(x);
            }
        }
        for (int i=0; i<stack.size(); i++){
            answer+=stack.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main52 T = new Main52();
        Scanner kb = new Scanner(System.in);
        String str =kb.next();

        System.out.print(T.solution(str));

    }
}

