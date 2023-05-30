package com.solve;

//comparable 방식 사용

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    public int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x==o.x) return this.y-o.y;
        else return this.x-o.x;

    }
}
public class Main67_1 {
     public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
         int n=kb.nextInt();
         ArrayList<Point> arr = new ArrayList<>();
         for (int i=0; i<n; i++){
             int x=kb.nextInt();
             int y=kb.nextInt();
             arr.add(new Point(x,y));
         }
         Collections.sort(arr);//컬렉션 프레임워크를 정렬하는 방법 기준은 위에 override 기준
         for (Point o : arr){
             System.out.println(o.x+" "+o.y);
         }
    }
}
