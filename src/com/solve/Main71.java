package com.solve;

import java.util.Scanner;

//재귀함수(스택프레임)
public class Main71 {
    public void DFS(int n) {
        if (n == 0) {
            return;//return은 값을 반환하기도 하지만 void에서는 종료의 의미도있다.
        }else{
            System.out.print(n+" ");//3 2 1 출력
            DFS(n - 1); //반환주소값에 10번째줄이 저장되고 자기차례가돼서 pop할때 그 아래줄부터 실행
            System.out.print(n+" ");//1 2 3 출력
        }
    }

    public static void main(String[] args){
        Main71 T = new Main71();
        Scanner kb = new Scanner(System.in);
        int n= kb.nextInt();
        T.DFS(n);

    }

}

//스택프레임:스택에 차례대로 저장되는 호출 정보
//함수가 호출되면 스택에 각 함수의 매개변수,반환주소값,지역변수가 저장된다. LIFO의 구조

//스택 오버플로우: 스택의 영역을 넘어서 데이터가 저장되는경우 발생
