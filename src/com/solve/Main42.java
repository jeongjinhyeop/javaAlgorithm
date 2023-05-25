package com.solve;


import java.util.HashMap;
import java.util.Scanner;


class Main42 {

    public String solution(String a,String b) {
        String answer = "YES";
        HashMap<Character,Integer> map = new HashMap<>();
        for (char x:a.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
/*        for (char y:b.toCharArray()){
            map.put(y,map.getOrDefault(y,0)-1);
        }*/
        //강의코드
        for(char y: b.toCharArray()){
            if(!map.containsKey(y)||map.get(y)==0) answer="NO";
            map.put(y,map.get(y)-1);
        }
        // 하고 코드 끝
/*        for (char key: map.keySet()){
            System.out.println(map);
            if (map.get(key)==0) {
                answer = "YES";
            }else {
                answer="NO";
                break;
                }
        }*/

        return answer;
    }


    public static void main(String[] args) {
        Main42 T = new Main42();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b=kb.next();

        System.out.print(T.solution(a,b));

    }
}

//나의 풀이
//1.String a,b 각각을 입력받는다.
//2.String a를 char로 쪼개 hashmap의 key값으로 만들고 반복되면 value 값을 증가시킨다.
//3.String b를 char로 쪼개 hashmap에 집어 넣는다 단 같은값이 존재하면 value값을 감소시킨다.
//4.반복문을 사용하여 모든 value값이 0인경우 YES출력 0이 아닌경우 NO 출력

//강의와 접근방식은 같았다.
//길이가 같기때문에 이런 코드가 가능하다.
//길이가 다를경우 aabb , abb를 비교하면 구성요소와 각 구성요소의 갯수가 같지 않은데 YES 출력됨
//채점하면 예제2 런타임에러뜸 왜?
