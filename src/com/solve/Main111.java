package com.solve;

import java.util.Scanner;


class Main111 {
    public String solution(String str) {// 문자하나를 사용할 때에는 char사용하네
        String answer = "";
        str= str+" ";//요부분으로 인덱스 넘어가는 것을 해결 할 수 있다. 내가 틀린 부분 안되는데?
        int p=1;
        for (int i =0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                p++;

            }else if (str.charAt(i)!=str.charAt(i+1) &&p>1){
                answer+=str.charAt(i);
                answer+=p;
                p=1;
            }else {
                answer+=str.charAt(i);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main111 T = new Main111();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        //char c = kb.next().charAt(0);//charAt이란 String 타입을 char타입으로 변환해주는 메서드
        System.out.print(T.solution(str));

    }
}