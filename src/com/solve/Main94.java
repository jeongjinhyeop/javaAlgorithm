package com.solve;


import java.util.*;

class Lecture implements Comparable<Lecture>{
    public int money,date;
    Lecture(int money,int date) {
        this.money = money;
        this.date = date;
    }


    @Override
    public int compareTo(Lecture o) {
        return o.date-this.date;//date기준으로 내림차순 정렬
    }
}
class Main94{

    static int max,n;
    public int Solution(ArrayList<Lecture> arr) {
        int answer=0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        //큰값을 우선순위로 하는 pQ
        Collections.sort(arr);
        int j=0;
        for (int i=max; i>=1; i--){
            for (; j<n; j++){
                if (arr.get(j).date<i) break;
                pQ.offer(arr.get(j).money);
            }
            if (!pQ.isEmpty()) answer+=pQ.poll();//pQ를 비워낼 필요는 업나?
        }



        return answer;
    }




    public static void main(String[] args) {
        Main94 T = new Main94();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i=0; i<n; i++){
            int m = kb.nextInt();
            int d = kb.nextInt();
            arr.add(new Lecture(m,d));
            if (d>max) max=d;
        }
        System.out.println(T.Solution(arr));

    }

}
