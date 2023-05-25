package com.solve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


class Main43 {

    public ArrayList<Integer> solution(int n,int m,int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lt=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<m-1; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (int rt=m-1; rt<n; rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt],map.get(arr[lt])-1);
            if (map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
        }




        return answer;
    }


    public static void main(String[] args) {
        Main43 T = new Main43();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m=kb.nextInt();
        int[] arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for (int x : T.solution(n,m,arr)){
            System.out.print(x+" ");
        }


    }
}

//생각한 풀이
//1.hashmap을 만들어서 put사용해서 값대입
//2.key값의 개수를 map.size()로 출력 answer 배열에 넣고 hashmap초기화
//3.sliding window는 어떻게 써야할까 ...?
