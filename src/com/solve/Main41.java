package com.solve;

import java.util.HashMap;
import java.util.Scanner;


class Main41 {

    public char solution(int n,String str) {
        char answer =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);//map.getOrDefault (x,0) mapping을 g
            //해서 x라는 key값이 존재하지 않을 경우 0을 reuturn해준다.
            //따라서 map.put을해서 key값이 없는경우 값을 만들고 key값이 있는경우 덮어쓰기를 해서 value값에 +1을한다.
        }

//        HashMap의 경우 동일 키 값을 추가할 경우 Value의 값이 덮어쓰기가 됩니다.
//        따라서 기존 key 값의 value를 계속 사용하고 싶을 경우
//        getOrDefault 메서드를 사용하여 위의 예와 같이 사용할 수 있습니다.
        int max= Integer.MIN_VALUE;
        for (char key: map.keySet()){//keySet(): key값과 해당하는 value 값 출력
            if (map.get(key)>max){//map.get(key) : key에 해당하는 value값 출력
                max=map.get(key);//해당 key의 value 값 return
                answer=key;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main41 T = new Main41();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str=kb.next();

        System.out.print(T.solution(n,str));

    }
}