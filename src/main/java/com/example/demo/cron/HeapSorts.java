package com.example.demo.cron;

import java.util.ArrayList;

public class HeapSorts<T>  {
    public static void main(String[] args) {



        ProductNdxpro root = new ProductNdxpro("SF", "용역 (NFLOW)", "용역", "NFLOW", 2,"FY");
        ProductNdxpro right = new ProductNdxpro("SN", "용역 (NDX Pro)", "용역", "NDX PRO", 4,"PY");
        ProductNdxpro left = new ProductNdxpro("RD", "R&D/지원사업", "R&D", "R&D", 5,"RD");
        ProductNdxpro right1 = new ProductNdxpro("PF", "라이선스 (NFLOW)", "라이선스", "NFLOW", 1,"FL");
        ProductNdxpro left1 = new ProductNdxpro("PN", "라이선스 (NDX Pro)", "라이선스", "NDX PRO", 3,"PL");

        HeapNode<ProductNdxpro> rootNode = new HeapNode<ProductNdxpro>(root,null, null);

        rootNode.setLeft(new HeapNode<ProductNdxpro>(left, new HeapNode<ProductNdxpro>(left1,null,null), new HeapNode<ProductNdxpro>(right1,null,null)));

        rootNode.setRight(new HeapNode<ProductNdxpro>(right, null, null));

        ArrayList<ProductNdxpro> productNdxpros = new ArrayList<>();
        productNdxpros.add(root);
        productNdxpros.add(right);
        productNdxpros.add(left);
        productNdxpros.add(right1);
        productNdxpros.add(left1);


//        HeapNode<ProductNdxpro> productNdxproHeapNode = sortHeap(productNdxpros);
        sortHeap(productNdxpros);

        swap(productNdxpros.get(0),productNdxpros.get(1));
//        System.out.println(productNdxproHeapNode);
//        System.out.println(productNdxpros);
        System.out.println(productNdxpros);
    }


    public static void sortHeap(ArrayList<ProductNdxpro> heapNode) {

        HeapNode<ProductNdxpro> root = null;

        for (int i = 0; i < heapNode.size(); i++) {
                  // i = 1
            HeapNode<ProductNdxpro> productNdxproHeapNode = new HeapNode<>(heapNode.get(i), null, null);

            if (root == null) {
                root = productNdxproHeapNode;
                continue;
            }

            if (root.getElement().getOrderNuml() < productNdxproHeapNode.getElement().getOrderNuml()) {
                    root = productNdxproHeapNode;
                root.setLeft(productNdxproHeapNode);
                root.setRight(productNdxproHeapNode);
            }
            else{
                root.setLeft(productNdxproHeapNode);
                root.setRight(productNdxproHeapNode);
            }

        }

    }
    public static void heaPify(ArrayList<ProductNdxpro> rootNode, int parentIdx, int lastIdx) {


    }
    private static void swap(ProductNdxpro root, ProductNdxpro productNdxproHeapNode) {

    }
    // 만약에 루트 노드 - 자식노드 가 0보다 크면 순서 체인지
    // 2 - 4
    private static int compare(HeapNode<ProductNdxpro> a,HeapNode<ProductNdxpro> b) {
        return a.getElement().getOrderNuml() - b.getElement().getOrderNuml();
    }
//
//    class Wrapper{
//        HeapNode<ProductNdxpro> productNdxproHeapNode;
//        Wrapper(<ProductNdxpro productNdxproHeapNode){
//            this.productNdxproHeapNode =productNdxproHeapNode;
//        }
//    }

    public static void Max(){

    }





    public static int parent(int childIndex) {
        int parent = (childIndex - 1) / 2;
       return parent;
    }

    public static int leftChild(int parentIndex) {
        int leftChildIndex = parentIndex * 2 + 1;

        return leftChildIndex;
    }

    public static int rightChild(int parentIndex) {
        int rightChildIndex = parentIndex * 2 + 2;

        return rightChildIndex;
    }


}
