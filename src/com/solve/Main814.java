package com.solve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}*/
public class Main814 {
    static int n,answer=0;
    static int[] dx={1,0,-1,0,1,1,-1,-1};
    static int[] dy={0,-1,0,1,1,-1,1,-1};
    public void BFS(int x, int y, int[][] board){
        Queue<Point> Q =new LinkedList<>();
        Q.add(new Point(x,y));
        while(!Q.isEmpty()){
           Point tmp =Q.poll();
           for (int i=0; i<8; i++) {
               int nx = tmp.x+ dx[i];
               int ny = tmp.y+ dy[i];
               if (nx>=0&& nx<n &&ny>=0&&ny<n &&board[nx][ny]==1){
                   board[nx][ny]=0;
                   Q.add(new Point(nx,ny));
               }
           }
        }
    }
    public void Solution(int[][] board){
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if (board[i][j]==1) {
                    board[i][j] = 0;
                    BFS(i, j, board);
                    answer++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main814 T = new Main814();
        Scanner kb = new Scanner(System.in);
        n =kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        T.Solution(arr);
        System.out.println(answer);
    }
}
