package com.solve;

import java.util.Arrays;
import java.util.Scanner;

//comparator 방식
class Main67 {

    public static void main(String[] args) {
        Main67 T = new Main67();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0]=kb.nextInt();
            arr[i][1]=kb.nextInt();
        }
        Arrays.sort(arr,(e1, e2)->{//람다식 public int e1,e2 와 같은말  의문점? int라고 선언을 안했느데 ?
            if (e1[0]==e2[0]){
                return e1[1]-e2[1];
            }else {
                return e1[0]-e2[0];            }
        });
        for (int i=0; i<n; i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
//comparator 의 compare(T o1,T o2)
//Arrays.sort() 는 2차원 배열을 정렬할 수 없다. --> 람다식을 사용하여 Arrays.sort()를 확장하여 사용