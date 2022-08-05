package com.example.demo.cron;

import java.util.ArrayList;
import java.util.Comparator;

public class HeapTest {
    private static Node root;
    private static Node cursor;

    public static void main(String[] args) {

        ArrayList<Node> arr = new ArrayList<>();

        Node root = null;
//        arr.add(new Node(4,new Node(1,new Node(2,null,null),new Node(5,null,null)),new Node(3,null,null)));
        arr.add(new Node(4,null,null));
        arr.add(new Node(1,null,null));
        arr.add(new Node(3,null,null));
        arr.add(new Node(2,null,null));
        arr.add(new Node(5,null,null));

        heapSort(arr);
        System.out.println(arr);

    }
    public static void heapSort(ArrayList<Node> arr){

        root = arr.get(0);
        cursor = root;

        }

    private static void heaPify(Node node){

        Node parent = node;

        Node maxNode = Max(parent,cursor.left,cursor.right);
        if (parent != maxNode){
            swap(parent,maxNode);
            cursor = maxNode;
            heaPify(parent);
        }
    }

    private static Node Max(Node a, Node b, Node c){
        ArrayList<Node> linkedList = new ArrayList<>();
        linkedList.add(a);
        linkedList.add(b);
        linkedList.add(c);

        linkedList.sort(new Comparator<>() {
            @Override
            public int compare(Node c1, Node c2) {
                return c2.value - c1.value;
            }
        });
        Node first = linkedList.get(0);
        return first;
    }

    private static void swap(Node a, Node b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

}


//    private void init(){
//        ArrayList<Node> arr = new ArrayList<>();
//        root = null;
//        arr.add(new Node(4,null,null));
//        arr.add(new Node(1,null,null));
//        arr.add(new Node(3,null,null));
//        arr.add(new Node(2,null,null));
//        arr.add(new Node(5,null,null));
//
//
//    }

