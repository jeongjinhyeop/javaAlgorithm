package com.solve;

import java.util.Scanner;
import java.util.Stack;


class Main51 {

    public String solution(String str){
        String answer="YES";
        Stack<Character> stack = new Stack<>();
        for (char x: str.toCharArray()){
            if (x=='(') stack.push(x);
            else  {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";//이 조건을 안쓰면 '(' 가 더 많은경우에도 YES출력

        return answer;
    }


    public static void main(String[] args) {
        Main51 T = new Main51();
        Scanner kb = new Scanner(System.in);
        String str =kb.next();

        System.out.print(T.solution(str));

    }
}
//처음생각
//괄호를 String 처리를 한다음 Hashmap에 넣어서 각 괄호의 갯수가 같으면 YES 다르면 NO를 출력하게 하였다.
//놓친부분  첫 괄호가 닫는 괄호일경우 && 마지막 괄호가 여는 괄호일 경우 return NO 를 빼먹음
// 큰따옴표로 값을 넣으면 인식이 안되서 null이 출력되더라
//강의보고 느낀점은 hashmap보다 stack이 속도가 같거나 빨라보였다.
