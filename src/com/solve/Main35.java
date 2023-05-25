package com.solve;

import java.util.Scanner;


class Main35 {

    public int solution(int n) {
        int answer =0;
        int lt=1;
        int rt=1;
        int sum=0;
        for (int i =rt; rt<n; rt++){
            if (n==sum){
                answer++;
                //lt++;
                // 를 해서 오답이 생긴거 이렇게 코드를 작성하면 sum=n 이후 lt증가
                //sum>n 이 때 한번더 lt가 커져서 총 두번 커지는 현상 발생
                //따라서 lt++는 sum=n에 필요하지 않는 조건이다.
                sum+=rt;
            }else if (sum>n){
                sum-=lt++;
                rt--;
            }else if (sum<n) {
                sum += rt;
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Main35 T = new Main35();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();


        System.out.print(T.solution(n));

    }
}
