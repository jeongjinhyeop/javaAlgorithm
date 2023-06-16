package com.solve;

import java.util.*;

class a implements Comparable<a>{
    public int x,y;
    a(int x,int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(a o) {
        if(o.y==this.y) return this.x-o.x;//오름차순
        else return this.y-o.y;
    }
}
class Main{
    static int n,cnt=0;
    static ArrayList<a> arr=new ArrayList<>();

    public int Solution() {

        int et=0;
        for (a ar: arr)
        {
            if (ar.x>=et){
                cnt++;
                et=ar.y;
            }
        }

        return cnt;
    }




    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        for (int i=0; i<n; i++){
            arr.add(new a(kb.nextInt(), kb.nextInt()));
        }
        Collections.sort(arr);
        System.out.println(T.Solution());

    }

}