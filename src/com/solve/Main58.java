package com.solve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class person {
    int id;
    int priority;
    public person (int id,int priority){
        this.id=id;
        this.priority=priority;
    }
}
class Main58 {

    public int solution(int n, int m , int[] arr){
        int answer =0;
        Queue<person> Q = new LinkedList<>();
        for (int i=0; i<n; i++){
            Q.offer(new person(i, arr[i]));
        }
        while (!Q.isEmpty()){//계속돌리는 방법
            person tmp = Q.poll();//첫번째 사람 정보 빼냄
            for (person x: Q){
                if (x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if (tmp!=null){
                answer++;
                if (tmp.id==m) return answer;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main58 T = new Main58();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= kb.nextInt();
        }

        System.out.print(T.solution(n,m,arr));


    }
}
