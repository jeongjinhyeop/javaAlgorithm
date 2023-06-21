package com.solve;

import java.util.*;

class TTime implements Comparable<TTime>{
    public int s,h;
    TTime(int s,int h){
        this.s=s;
        this.h=h;
    }

    @Override
    public int compareTo(TTime ob) {
        return (ob.s/ob.h)-(this.s/this.h);
    }
}


class Main106_1 {

    static int n,m;
    static int[] dy,time;
    static ArrayList<TTime> arr;
    public int Solution(){
        time=new int[n];
        Collections.sort(arr);
        dy[0]=arr.get(0).s;
        int sh=arr.get(0).h;
        int max =0;
        time[0]=sh;
        int answer=0;
        for (int i=1; i<arr.size(); i++){
            for (int j=i-1; j>=0; j--){
                if (sh+arr.get(j).h<=m){
                    max=arr.get(i).s+dy[j];
                    time[i]=sh+arr.get(i).h;
                }
                dy[i]=max;
                answer =Math.max(max,answer);
            }
        }





        return answer;
    }
    public static void main(String[] args) {
        Main106_1 T = new Main106_1();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr=new ArrayList<TTime>();
        for (int i =0; i<n; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            arr.add(new TTime(a,b));
        }
        dy=new int[n];
        System.out.println(T.Solution());
    }
}

