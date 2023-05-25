package com.solve;

import java.util.Scanner;

class Main15 {
    public String solution(String str){
        String answer;
//        for (String x : str){
        //          String tmp= new StringBuilder(x).reverse().toString();
        //        answer.add(tmp);
        //  }

        char[] c =str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;//-1 써야하는 것 주의
        while (lt<rt){
            if (!Character.isAlphabetic(c[lt])){
                lt++;//하나씩 증가시켜주고
            }else if(!Character.isAlphabetic(c[rt])){
                rt--;
            }else{
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;//하나씩 증가시켜주고
                rt--;//하나씩 감소시켜줘야함
            }
        }
        answer = String.valueOf(c); // valueOf는  다른 타입을 String타입으로 변환해준다.
        //toString과의 차이점은 toString은 값이 null일 때 NullPointException발생시킴 반면  vlaueOf는 값이 null일때 null이라는 텍스트 출력
        //valueOf 는 static 객체라 객체.valueOf도 가능하지만 String.valueOf도 가능하다

        return answer;
    }
    public static void main(String[] args) {
       // Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
     //   System.out.println(T.solution(str));
    }
}


