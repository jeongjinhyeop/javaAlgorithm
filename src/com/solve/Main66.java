package com.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Main66 {

    public ArrayList<Integer> solution(int n,int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(arr);
        for (int i=0; i<n; i++){
            if (tmp[i]!=arr[i]){
                answer.add(i+1);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main66 T = new Main66();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= kb.nextInt();
        }
        for (int x:T.solution(n,arr)) {
            System.out.print(x+" ");
        }
    }
}

//인덱스를 변수에 저장한다음 출력하면 될것 같다.
// 배열중 랜덤으로 두개를 지정한다음 값 바꾸면 될듯
//arr.clone(); 깊은복사라고한대 깊은복사가 뭔데 ?
//깊은 복사(Deep Copy)는 '실제 값'을 새로운 메모리 공간에 복사하는 것을 의미하며,
//
//얕은 복사(Shallow Copy)는 '주소 값'을 복사한다는 의미입니다.
//왜 순서대로 들가냐?