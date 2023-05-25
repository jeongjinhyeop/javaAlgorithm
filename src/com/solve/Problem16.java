package com.solve;

import java.util.Scanner;

class Main16 {
    public String solution(String str){
        String answer= ""; //answer을 " "로 작성하게 되면 뒤에 str.charAt(i)를 하나씩 추가 할 때 맨 앞에 공백이 생기게되어 오답이 출력된다.
        for (int i =0; i<str.length(); i ++){
            if (str.indexOf(str.charAt(i))==i){ //indexOf를 사용하기 위해서 만든 문제
                answer += str.charAt(i);
            }

        }
//           char[] c = str.toCharArray();
//            for(int i = 0; i<str.length(); i++){
//                for (int j = 1; j<str.length(); j++){
//                    if(c[i]==c[j]){
//
//                    }
//                }
//            }


//            answer = String.valueOf(c);

        return answer;
    }
    public static void main(String[] args) {
       // com.Practice.Main T = new com.Practice.Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
      //  System.out.println(T.solution(str));
    }
}


//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지


//chatAt(i):해당 글지를 char타입으로 변경해준다.
//indexOf(): 해당 글자의 첫번째 위치 인덱서 번호를 반환받을 수 있다.