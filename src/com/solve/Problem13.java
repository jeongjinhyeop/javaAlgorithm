package com.solve;

import java.util.Scanner;

class Main1 {
    public String solution(String str){
        String answer = " ";
        int m = Integer.MIN_VALUE;
        //Integer.MIN_VALUE= -2147483648
        //Integer.MAX_VALUE=  2147483648
        String[] arr = str.split(" ");// ""이렇게 써서 한 글자씩 담김 " " 이렇게 써야 띄어쓰기를 기준으로 spilt 한다.
//        for(int i = 0; i<str.length(); i++){ //ArrayIndexOutofBoundsException
//            if( answer.length()<arr[i].length()) {//ArrayIndexOutofBoundsException
//                answer += arr[i];
//            }
//        }

// 왜 한 단어씩 담기지 않고 한 글자씩만 담기는 걸까 ??  --> ""이렇게 써서 한 글자씩 담김 " " 이렇게 써야 띄어쓰기를 기준으로 spilt 한다.

        for(String x : arr){
            // System.out.println(x);
            int a = x.length();
            if(a>m){// 똑같은 길이어도 계속 앞쪽이 유지된다.
                m = a;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
       // com.Practice.Main T = new com.Practice.Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
      //  System.out.println(T.solution(str));


    }
}
