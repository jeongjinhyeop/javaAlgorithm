package com.solve;

import java.util.Arrays;
import java.util.Scanner;

class Main31 {

    public int[] solution(int n,int[] arr1,int m,int[] arr2) {
        int[]  answer = new int[n+m];
        for (int i=0; i<n; i++){
            answer[i]=arr1[i];
        }
        for (int i=0; i<m; i++){
            answer[n+i]=arr2[i];
        }
        Arrays.sort(answer);

        return answer;
    }


    public static void main(String[] args) {
        Main31 T = new Main31();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]= kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2= new int[m];
        for (int j=0; j<m; j++){
            arr2[j]= kb.nextInt();
        }
        System.out.print(Arrays.toString(T.solution(n, arr1, m, arr2)));


    }
}

//풀이
//1.두 배열을 합침
//2.배열 정렬
//3.Arrays.toString()으로 결과 값 출력
//문제점
// toString으로 출력해서 [1,2,3,4] 요런식으로 출력
//해결책
//for 문으로 배열의 요소들을 하나씩 빼내야 한다.
//kb.nextInt()로 값을 받을때 순서대로 받아야 하기 때문에

//3
//1 3 5
//5
//2 3 6 7 9
//를 입력 받았을 때
//int n=kb.nextInt();
//int[] arr1= new int[n];
//for(int i=0; i<n; i++){arr[i]=kb.nextInt();} 요런식으로 나타내야함

//그러나 중요한 점은 문제를 이러한 방식으로 푸는 것을 요구하는 것이아니다.
//two point 알고리즘을 사용할 수 있는가를 묻는 문제이다.
