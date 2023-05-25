package com.solve;

import java.util.Scanner;


class Main212 {

    public int solution(int n,int m, int[][] arr) {
        int answer = 0;

        for (int i=1; i<=n; i++){//i 와 j는 학생이니 둘다 n보다 작거나 같다로 해야지 m을 넣으니 틀리지
            for (int j=1; j<=n; j++) {
                int cnt=0;
                for (int k=0; k<m; k++){
                    int pi=0;
                    int pj=0;
                    for (int s=0; s<n; s++){
                        if (arr[k][s]==i) pi=s;
                        if (arr[k][s]==j) pj=s;

                    }
                    if (pi<pj) cnt++;
                }
                if (cnt==m) answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main212 T = new Main212();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n,m,arr));

    }
}

//내풀이대로 하면 시험 동안 총 몇명을 이겼는가 정도는 알 수 있겠다. 그런데 정확히 누구를 이겼는지 알 수 없다.
//풀이
//1.i를 멘토학생 j를 멘티 학생으로 설정
//2. k를 학생 등수 s를 시험 횟수로 지정 arr[k][s]
//3. pi,pj를 설정하고 arr[k][s]값이 i와 같은경우 pi에 s값을 담는다. 이러면 k번째 시험에 i학생이 몇 등인지 알 수 있다. pj도 마찬가지로 담는다.
//4. pi값이 pj보다 작은경우 cnt 값을 증가 시킨다. pi값이 pj 값보다 작다는 것은 등수가 높다는 뜻이기때문
//5. cnt값이 시험횟수인 m과 일치하면 모든 시험에서 멘토i가 멘티j보다 등수가 높다는 뜻 이므로 answer++ 시켜준다.
