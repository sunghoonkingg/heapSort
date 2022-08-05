package com.example.demo.cron;



public class HeapSort {
    public static void main(String[] args) {

        int[] a = {6, 3, 1, 2, 7, 5, 4, 8, 8};

        heapsort(a);

        for (int q :a) {
            System.out.print(q);

        }

    }

    //부모 인덱스를 얻는 함수
    public static int getParent(int child){
        return (child -1) /2;
    }
    // 두 인덱스의 원소를 교환하는 함수
    private static void swap(int[] a, int i, int j){

        // [5,8]
        // 5 = i = 인덱스는 2
        // 8 = j = 인덱스는 5
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // 힙을 만드는 함수
    private static void heapify(int[] a, int parentIdx, int lastIdx){

        // 현재 트리에서 부모 노드의 자식 노드 인덱스를 각각 구해준다.
        // 현재 부모 인덱스를 가장 큰 값을 가지고 있다고 가정한다.
        int largestIdx = parentIdx;
        int leftChildIdx = 2 * parentIdx +1;
        int rightChildIdx = 2 * parentIdx +2;



        // left child node와 비교
        // 자식 노드 인덱스가 끝의 원소 인덱스를 넘어가지 않으면서 현재 가장 큰 인덱스보다 왼쪽 자식노드의 값이 더 클 경우
        // 가장 큰 인덱스를 가리키는 largestIdx를 왼쪽 자식노드인덱스로 바꿔준다.
        if (leftChildIdx < lastIdx && a[largestIdx] > a[leftChildIdx]){
            largestIdx  =  leftChildIdx;
        }

        /*
         *  left right node와 비교
         *  자식노드 인덱스가 끝의 원소 인덱스를 넘어가지 않으면서
         *  현재 가장 큰 인덱스보다 오른쪽 자식노드의 값이 더 클경우
         *  가장 큰 인덱스를 가리키는 largestIdx를 오른쪽 자식노드인덱스로 바꿔준다.
         *
         */
        if(rightChildIdx < lastIdx && a[largestIdx] > a[rightChildIdx]) {
            largestIdx = rightChildIdx;
        }
        /*
         * largestIdx 와 부모노드가 같지 않다는 것은
         * 위 자식노드 비교 과정에서 현재 부모노드보다 큰 노드가 존재한다는 뜻이다.
         * 그럴 경우 해당 자식 노드와 부모노드를 교환해주고,
         * 교환 된 자식노드를 부모노드로 삼은 서브트리를 검사하도록 재귀 호출 한다.
         */
        if(parentIdx != largestIdx) {
            swap(a, largestIdx, parentIdx);
            heapify(a, largestIdx, lastIdx);
        }
    }

    public static void heapsort(int[] arr){
        int size = arr.length;
        /*
         * 부모노드와 heaify과정에서 음수가 발생하면 잘못 된 참조가 발생하기 때문에
         * 원소가 1개이거나 0개일 경우는 정렬 할 필요가 없으므로 바로 함수를 종료한다.
         */
    if (size < 2 ){
        return;
    }
    // 가장 마지막 노드의 부모 노드 인덱스
    int parentIdx = getParent(size-1);

    // max heap 만들기
    for (int i = parentIdx; i >= 0; i--){

        heapify(arr,i,size-1);
    }

    }

}




