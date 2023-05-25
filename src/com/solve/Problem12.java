package com.solve;

import java.util.Scanner;

public class Problem12 {
    public String solution(String str){
        String answer = "";
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){

                answer += Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){

                answer += Character.toUpperCase(c);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Problem12 T = new Problem12();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));


    }
}
