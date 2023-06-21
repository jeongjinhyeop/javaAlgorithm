package com.solve;

import java.util.*;

class Block implements Comparable<Block>{
    public int a,w,h;
    Block(int a,int h,int w){
        this.a=a;
        this.h=h;
        this.w=w;
    }

    @Override
    public int compareTo(Block ob) {
        return ob.a-this.a;
    }
}
class Main104 {

    static ArrayList<Block> arr;
    static int[] dy;
    public int Solution(int n){
        Collections.sort(arr);
        dy=new int[n];
        dy[0]=arr.get(0).h;
        int answer=0;
        for (int i=1; i<arr.size(); i++) {
            int max=0;
            for (int j = i-1; j >=0; j--) {
                if (arr.get(j).w > arr.get(i).w&&dy[j]>max){
                    max=dy[j];
                }
                dy[i]=max+arr.get(i).h;
                answer=Math.max(answer,dy[i]);
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        Main104 T = new Main104();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        arr=new ArrayList<>();
        for (int i =0; i<n; i++){
            int a=kb.nextInt();
            int w=kb.nextInt();
            int h=kb.nextInt();
            arr.add(new Block(a,w,h));
        }
        System.out.println(T.Solution(n));
    }
}
