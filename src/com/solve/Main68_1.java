package com.solve;


import java.util.Arrays;
import java.util.Scanner;


class Main68_1 {
    public int solution(int n, int m,int[] arr){
        int answer = 0;
        int lt=0,rt=n-1;

        Arrays.sort(arr);
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if (arr[mid]==m){
                answer=mid+1;
                break;
            }else if (arr[mid]>m){
                rt=mid-1;
            }else {
                lt=mid+1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Main68_1 T = new Main68_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=kb.nextInt();

        }
        System.out.println(T.solution(n,m,arr));
    }
}

//이분검색 방식
