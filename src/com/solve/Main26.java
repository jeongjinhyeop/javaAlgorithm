package com.solve;

import java.util.ArrayList;
import java.util.Scanner;


class Main26 {
    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i=2; i<num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int n, int[] arr) {//이중for문으로 가능하긴 한데 시간초과뜰 가능성 높다고 하심
        ArrayList<Integer> answer = new ArrayList<>();  //에라토스테네스 체 방식
        int[] ch = new int[n];

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;//위에쓰면 지역변수가 아니라 초기화 되지 않는 현상 발생
            while ((tmp> 0)) {
                int t = tmp%10;
                res =res*10+t;
                tmp =tmp/10;
            }
            if (isPrime(res)){
                answer.add(res);
            }
        }



        return answer;
    }


    public static void main(String[] args) {
        Main26 T = new Main26();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
//  for (int i = 1; i < ch[i]; i++) {

//       if (ch[i]!=1 && (ch[i] % i == 0)&&(ch[i]/i==1)) {
//       answer.add(a[i]);
//       }
//      }
