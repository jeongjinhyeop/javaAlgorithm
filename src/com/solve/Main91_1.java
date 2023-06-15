package com.solve;



import java.util.*;

class a{
    public int x,y;
    a(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
class Main91_1{
    static int n,answer;
    static int[] w,h;
    static ArrayList<a> wh= new ArrayList<>();
    public int Solution() {
        answer=wh.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (wh.get(i).x < wh.get(j).x && wh.get(i).y < wh.get(j).y) {
                    answer--;
                    break;
                }
            }

        }
        return answer;
    }




    public static void main(String[] args) {
        Main91_1 T = new Main91_1();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        w= new int[n];
        h= new int[n];
        for (int i=0; i<n; i++){
            wh.add(new a(kb.nextInt(), kb.nextInt()));
        }
        System.out.println(T.Solution());

    }

}
