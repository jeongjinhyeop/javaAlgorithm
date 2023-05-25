package com.solve;



import java.util.ArrayList;
import java.util.Scanner;


class Main21 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i=1; i<n; i++){
            if (arr[i]>arr[i-1]){
                answer.add(arr[i]);
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Main21 T = new Main21();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = kb.nextInt();}
        for(int x :T.solution(n,arr)){
            System.out.print(x+" ");
        }

    }
}

//        int[] answer = new int[n];
//        //ArrayList와 가장 큰 차이점 ArrayLisf는 동적으로 범위가 설정되기 때문에 결과 값이 달라짐
//        //처음에 기본형 배열을이용하여 문제를 풀고 싶었다. 문제점:기본형 배열이 동적이지 않기 때문에 0이 들어가는 현상 발생
//        //[0,0,0,0,0,0] 이러한 배열이 만들어진 채로 시작하는거네 0 인 값은 조건에 해당하지 않는 곳
//        answer[0] += arr[0];
//        // answer.add(arr[0]);// ArrayList에 int 값을 추가할 때 add 메소드를 이용
//        for(int i = 1; i<n; i++ ) {
//            if (arr[i] > arr[i - 1] && arr[i]!=0) {
//                answer[i] = arr[i];
//            }
//        }