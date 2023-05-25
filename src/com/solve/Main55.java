package com.solve;

import java.util.Scanner;
import java.util.Stack;


class Main55 {

    public int solution(String str){
        int answer =0;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }else if (str.charAt(i)==')'){
                stack.pop();
                if (str.charAt(i-1)==')') answer++;
                else answer+=stack.size();
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main55 T = new Main55();
        Scanner kb = new Scanner(System.in);
        String str= kb.next();

        System.out.print(T.solution(str));


    }
}

//문제접근
//여는 괄호가 연속해서 나오면 스택에 여는 괄호를 담는다.
//여는괄호 다음 닫는 괄호가 나오는 경우 스택에서 하나를 pop시키고
// 스택의 size()+1을 answer에 더한다.(peek로 비교해보면 될듯 )
//맨처음과 맨끝에 여는 괄호다음 닫는 괄호가 나오는 경우는 값이 더해지지 않도록 설정

//()가 나오는 것을 조건을 어찌 걸어야 될까? 이것만 해결하면 풀릴듯
//즉 레이저 인지 막대기인지를 구분 어찌할까 :인덱스로
//배열 만들필요없고 charAt쓰면됨