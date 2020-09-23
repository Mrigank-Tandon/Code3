package com.company.LeetCodeAugustChallenge;

import java.util.*;

public class bstksumpath {
    String path;
    static int c;
    static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        bstksumpath bst=new bstksumpath();
        bst.haspath(root,10,"");

    }

    private void haspath(Node root, int sum, String path {
        if(root!=null){
            if(root.value>sum){
                
            }
            else{
                sum=sum-root.value;
                if(sum==0){
                    c++;
                }
                haspath(root.left,sum,path);
                haspath(root.right,sum,path);
            }
        }
    }


}
