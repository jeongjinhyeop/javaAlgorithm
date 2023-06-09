package com.solve;


import java.util.*;


class Main85 {
    //동전 교환
    static int n,m,answer=Integer.MAX_VALUE;
    static Integer[] a;
    public  void DFS(int L,Integer[] b,int s) {
        if (s>m) return;
        if (L>=answer) return;
        if (s == m) {
            answer=Math.min(answer,L);
        } else {
            for (int i = 0; i <a.length; i++) {
                DFS(L+1,a,s+a[i]);
            }
        }

    }



    public static void main(String[] args) {
        Main85 T = new Main85();
        Scanner kb = new Scanner(System.in);
        n= kb.nextInt();
        a= new Integer[n];
        for (int i=0; i<n; i++){
            a[i]= kb.nextInt();
        }
        Arrays.sort(a,Collections.reverseOrder());//Collections 쓰려면 기본형 int x 객체형 Integer로 바꿔야함
        m= kb.nextInt();
        T.DFS(0,a,0);
        System.out.println(answer);
    }
}
