package com.solve;

import java.util.*;

/*class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}*/
public class Main813 {
    static int n,x,y,answer=0;
    static int[] dx={1,0,-1,0,1,1,-1,-1};
    static int[] dy={0,-1,0,1,1,-1,1,-1};
    public void DFS(int x, int y, int[][] board){
            for (int i=0; i<8; i++) {
                int nx = x+ dx[i];
                int ny = y+ dy[i];
                if (nx>=0&& nx<n &&ny>=0&&ny<n &&board[nx][ny]==1){
                    board[nx][ny]=0;
                    DFS(nx,ny,board);
                }
            }
        }
    public void Solution(int[][] board){
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if (board[i][j]==1) {
                    board[i][j] = 0;
                    DFS(i, j, board);
                    answer++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main813 T = new Main813();
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
