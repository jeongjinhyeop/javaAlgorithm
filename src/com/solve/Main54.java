package com.solve;

import java.util.Scanner;
import java.util.Stack;


class Main54 {

    public int solution(String str){
        int answer =0;
        Stack<Integer> stack = new Stack<>();
        for (char x: str.toCharArray()){
            if (Character.isDigit(x)){
                stack.push(x-48);//char: 48==int: 0;
            }else{
                int rt=stack.pop();
                int lt=stack.pop();
                if (x=='+') stack.push(lt+rt);
                else if (x=='-') stack.push(lt-rt);
                else if (x=='*') stack.push(lt*rt);
                else if (x=='/') stack.push(lt/rt);
            }
        }
        answer=stack.get(0);
        return answer;
    }


    public static void main(String[] args) {
        Main54 T = new Main54();
        Scanner kb = new Scanner(System.in);
        String str= kb.next();

        System.out.print(T.solution(str));

    }
}

