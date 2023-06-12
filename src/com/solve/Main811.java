package com.solve;

import java.util.*;
/*class Point{
    public int x,y;
    Point(int x , int y){
        this.x=x;
        this.y=y;
    }
}*/
class Main811 {
    //동전 교환
    static int answer=0;
    static int[] dx={-1,0,1,0},dy={0,-1,0,1};
    static int[][] dis , board;
    static
    public void BFS(int x,int y){
        Queue<Point> Q =new LinkedList<>();
        Q.offer(new Point(x,y));
        board[x][y]=1;
        while (!Q.isEmpty()){
            Point tmp = Q.poll();
            for (int i =0; i<4; i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if (nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){
                    board[nx][ny]=1;
                    Q.offer(new Point(nx,ny));
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }


    public static void main(String[] args) {
        Main811 T = new Main811();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for(int i=1; i<8; i++){
            for (int j=1; j<8; j++){
                board[i][j]=kb.nextInt();
            }
        }
        board[1][1]=1;
        T.BFS(1,1);
        if (dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}