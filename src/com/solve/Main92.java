package com.solve;

import java.util.*;

class b implements Comparable<b>{
    public int x,y;
    b(int x,int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(b o) {
        if(o.y==this.y) return this.x-o.x;//오름차순
        else return this.y-o.y;
    }
}
class Main92{
    static int n,cnt=0;
    static ArrayList<b> arr=new ArrayList<>();

    public int Solution() {

        int et=0;
        for (b ar: arr)
        {
            if (ar.x>=et){
                cnt++;
                et=ar.y;
            }
        }

        return cnt;
    }




    public static void main(String[] args) {
        Main92 T = new Main92();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        for (int i=0; i<n; i++){
            arr.add(new b(kb.nextInt(), kb.nextInt()));
        }
        Collections.sort(arr);
        System.out.println(T.Solution());

    }

}