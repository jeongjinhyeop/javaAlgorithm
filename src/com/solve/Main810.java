package com.solve;

import java.util.*;

class Main810 {
    //동전 교환
    static int answer=0;
    static int[] dx={-1,0,1,0},dy={0,-1,0,1};
    static int[][] board;
    public void DFS(int x,int y){
        if (x==7&&y==7){
            answer++;
        }else{
            for (int i =0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if (nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){
                    board[nx][ny]=1;
                    DFS(nx,ny);
                    board[nx][ny]=0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Main810 T = new Main810();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        for(int i=1; i<8; i++){
            for (int j=1; j<8; j++){
                board[i][j]=kb.nextInt();
            }
        }
        board[1][1]=1;
        T.DFS(1,1);
        System.out.println(answer);
    }
}
