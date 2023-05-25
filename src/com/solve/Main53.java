package com.solve;


import java.util.Scanner;
import java.util.Stack;


class Main53 {

    public int solution(int n,int[][] board,int m, int[] arr){
        int answer =0;
        Stack<Integer> stack = new Stack<>();
        for (int pos:arr) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][pos - 1] != 0) {
                    //   stack.push(board[j][arr[i]-1]);바로넣으면안됨
                    int tmp = board[j][pos - 1];
                    board[j][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else stack.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main53 T = new Main53();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] arr= new int[m];
        for (int i=0; i<m; i++){
            arr[i]=kb.nextInt();
        }

        System.out.print(T.solution(n,board,m,arr));

    }
}
