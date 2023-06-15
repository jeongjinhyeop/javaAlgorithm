package com.solve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
    public int h,w;
    Body(int h, int w){
        this.h=h;
        this.w=w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h-this.h;
    }
}
public class Main91 {
    public int Solution(ArrayList<Body> arr,int n){
        int cnt=0;
        Collections.sort(arr);
        int max= Integer.MIN_VALUE;
        for (Body x: arr){
            if (x.w>max){
                max=x.w;
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Main91 T = new Main91();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr =new ArrayList<>();
        for (int i=0; i<n; i++){
            int h=kb.nextInt();
            int w=kb.nextInt();
            arr.add(new Body(h,w));
        }
        System.out.println(T.Solution(arr,n));
    }
}

//배열을 만들면서 미리 키로 정렬을 해놨기 때문에 몸무게만 비교하면됨
