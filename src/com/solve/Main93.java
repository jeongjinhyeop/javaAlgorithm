package com.solve;

import java.util.*;

class Time implements Comparable<Time>{
    public int time;
    public char state;
    Time(int time,char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if(o.time==this.time) return this.state-o.state;//오름차순
        else return this.time-o.time;
    }
}
class Main93{
    static int n,cnt=0;
    static ArrayList<Time> arr=new ArrayList<>();

    public int Solution() {
        int cnt=0,answer=Integer.MIN_VALUE;
        for (Time x:arr){
            if (x.state=='s') cnt++;
            else cnt--;
            answer=Math.max(answer,cnt);
        }


        return answer;
    }




    public static void main(String[] args) {
        Main93 T = new Main93();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        for (int i=0; i<n; i++){
            arr.add(new Time(kb.nextInt(), 's'));
            arr.add(new Time(kb.nextInt(),'e'));
        }
        Collections.sort(arr);
        System.out.println(T.Solution());

    }

}
