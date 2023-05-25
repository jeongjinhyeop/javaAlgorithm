package com.solve;

import java.util.HashMap;
import java.util.Scanner;


class Main44 {

    public int solution(String a, String b) {
        int answer =0;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> mapb = new HashMap<>();
        int lt=0;
        int cnt =0;
        for (char x: b.toCharArray()){
            mapb.put(x,mapb.getOrDefault(x,0)+1);
        }
        for (int i=0; i<b.length()-1; i++){
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
        }
        for (int rt=b.length()-1; rt<a.length(); rt++){
            map.put(a.charAt(rt),map.getOrDefault(a.charAt(rt),0)+1);
            if (map.equals(mapb)) answer++;
            map.put(a.charAt(lt),map.get(a.charAt(lt))-1);
            if (map.get(a.charAt(lt))==0) map.remove(a.charAt(lt));
            lt++;

        }


//        HashMap<Character,Integer> map = new HashMap<>();
//        for (char x: a.toCharArray() ) {
//            map.put(x, map.getOrDefault(x, 0) + 1);
//        }
//        for (char x: b.toCharArray()){
//            if (map.containsKey(x)==true){
//                answer++;
//            }
//        }
        return answer;
    }


    public static void main(String[] args) {
        Main44 T = new Main44();
        Scanner kb = new Scanner(System.in);
        String a= kb.next();
        String b =kb.next();
        System.out.print(T.solution(a,b));

    }
}
//equals로 map끼리 비교 가능!, charAt을 사용하면 구지 Character 배열을 만들필요가 없어짐.
// 혼자 작성했던 코드 다시 분석해보기
//문제풀이
//내가한 방법은 a문자열에 a,b,c 가 각각 들어있는가를 찾고 같은 개수만큼 리턴해주는 코드
