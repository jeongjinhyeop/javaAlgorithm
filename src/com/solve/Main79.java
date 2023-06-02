package com.solve;

//말단 노드 찾기 DFS
//class Node{
//    Node lt,rt;
//    int data;
//    public Node(int val){
//        data=val;
//        lt=rt=null;
//    }
//}
public class Main79 {
    Node root;

    public int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));


    }
    public static void main(String[] args){
        Main79 tree = new Main79();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(tree.DFS(0,tree.root));
    }
}
