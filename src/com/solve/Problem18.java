package com.solve;

import java.util.Scanner;


class Main18 {
    public String solution(String str) {
        String answer = "NO";
        String s = str.toUpperCase().replaceAll("[^A-Z]", "");
        String x = new StringBuilder(s).reverse().toString();
        System.out.println(s);
        if (s.equals(x)) {

            answer = "YES";
        }


        return answer;
    }


    public static void main(String[] args) {
     //   com.Practice.Main T = new com.Practice.Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
       // System.out.println(T.solution(str));
    }
}
//replace 에는 정규식을 사용할 수없다
//replace 에는 정규식을 사용할 수 있다.  정규식이란 ?
//replaceAll("[^A-Z]",""); 알파벳이 아니면(^ 부정표시) 공백으로