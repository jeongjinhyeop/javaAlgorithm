package com.solve;

import java.util.Scanner;

class Main17 {
    public String solution(String str){
        String answer = "NO";
        String c =new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(c)) { //equals 는 대소문자 구분을 함
            answer ="YES";
        }
//   두번째 방법
//        String answer = "YES";
//        str = str.toUpperCase();
//
//        int len = str.length();
//        for (int i = 0; i < len/2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)){
//                return "NO";
//            }
//        }
        return answer;
    }


    public static void main(String[] args) {
       // com.Practice.Main T = new com.Practice.Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
     //   System.out.println(T.solution(str));
    }
}
//처음 시도 해본 방법
//            char[] c = a.toCharArray();
//            int lt = 0;
//            int rt = a.length()-1;
//            while (lt<rt){
//                if (c[lt]==c[rt]){
//                    lt++;
//                    rt--;
//                    answer = "YES";
//                }else{
//                    answer = "NO";
//                }
//
//            }// 처음 생각 Time Limit Exceed 오류 발생
// 문득 든 생각 toCharArray 를 쓴 문제와 charAt을 쓴 문제의 차이 확인해보기