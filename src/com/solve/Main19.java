package com.solve;

import java.util.Scanner;


class Main19 {
    public int solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()){
            if (Character.isDigit(c)){
                answer+=c;//mm9를 넣으면 57이 출력되는 이유
                //isDigit 함수를 사용했기 때문에 char 값중에서 0~9 가 할당된 48~57의 수가 출력됨
                //mm9에서 m은 아스키 코드에서 할당값이 48~57이 아니기때문에 false
                //char 9 는 아스키코드 값으로 숫자 57이다.
                //따라서 int answer에 57 이라는 값이 담아서 출력된다.(String answer이라면 "9"가 출력) 출력
                //이를 9 로 받고 싶으면 형변환을 통해 int 형으로 변경해줘야한다.
                //Integer.parseInt(answer);
            }
        }
//      3. 세번째 풀이
//        for (char c : str.toCharArray()){
//            if (Character.isDigit(c)){
//                answer+=c;
//            }
//        }
//        return Integer.parseInt(answer);
//    }
//        2. 두번째 풀이(아스키코드 번호를 사용하여 풀이)
//        for (char c : str.toCharArray()){
//            if (c>=48 && c<=57){
//                answer= answer*10+(c-48);//이게 가능한 이유 char(ASCII코드), int 자료형은 둘 다 정숫값을 저장하는 변수를 선언할 때 사용하기 때문
//            }
//        }


//        1. 첫번째 풀이
//        String s = str.replaceAll("[^0-9]", "");
//        answer =Integer.parseInt(str);
//
//
//
        return Integer.parseInt(answer);
    }


    public static void main(String[] args) {
        Main19 T = new Main19();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
//replace 에는 정규식을 사용할 수없다
//replace 에는 정규식을 사용할 수 있다.  정규식이란 ?
//replaceAll("[^A-Z]",""); 알파벳이 아니면(^ 부정표시) 공백으로