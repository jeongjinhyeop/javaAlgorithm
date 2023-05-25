package com.solve;

import java.util.ArrayList;
import java.util.Scanner;

class Main14 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
//        for (String x : str){
        //          String tmp= new StringBuilder(x).reverse().toString();
        //        answer.add(tmp);
        //  }
        for (String x : str){
            char[] c =x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;//-1 써야하는 것 주의
            while (lt<rt){
                char tmp = c[lt];
                c[lt]=c[rt];
                c[rt]=tmp;
                lt++;//하나씩 증가시켜주고
                rt--;//하나씩 감소시켜줘야함
            }
            String tmp = String.valueOf(c);
            //valueOf 는 static 객체라 객체.valueOf도 가능하지만 String.valueOf도 가능하다
            //toString과의 차이점은 toString은 값이 null일 때 NullPointException발생시킴 반면  valueOf는 값이 null일때 null이라는 텍스트 출력
            //valueOf 는 static 객체라 객체.valueOf도 가능하지만 String.valueOf도 가능하다
            answer.add(tmp);
            //1. ArrayList.add(E e)
            //리스트의 마지막에 인자로 전달된 아이템을 추가합니다.
        }
        return answer;
    }



    public static void main(String[] args) {
        Main14 T = new Main14();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i= 0; i<n; i++){
            str[i]= kb.next();
        }
        //for (String x : T.solution(n,str)){
       //     System.out.println(x);
        }


    }




//String 이 있는데 StringBuilder가 있는 이유 String은 불변객체이기때문에 한번 만들면 변경이 불가함
//이러한 단점을 보완하기 위해서 StringBuilder 라는 것이 생김 한번 찾아보기
//String은 객체가 계속해서 만들어지기 때문에 메모리낭비도 없고 무겁지도 않고 등.... Stirng 연산이 많아질 떄 사용

