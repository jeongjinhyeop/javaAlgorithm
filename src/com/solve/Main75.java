package com.solve;

//이진트리
class Node{
    int data;
    Node lt,rt;
    public  Node(int val){
        data=val;
        lt=rt=null;
    }

}
public class Main75 {
    Node root;
    public void DFS(Node root){
        if (root==null) return;
        else {
            System.out.println(root.data+" ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }
    public static void main(String[] args){
        Main75 tree = new Main75();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.rt.rt=new Node(5);
        tree.DFS(tree.root);
    }
}
