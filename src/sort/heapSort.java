package sort;

import java.util.*;

public class heapSort {
    public static void main(String[] args){
        PriorityQueue<Integer> heap = new PriorityQueue<>(new myComp());
        heap.add(5);
        heap.add(7);
        heap.add(3);
        heap.add(0);
        heap.add(2);
        heap.add(5);
        while(!heap.isEmpty()){
            System.out.print(heap.poll());
        }
    }
    static class myComp implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1; // 从大到小 排
        }
    }
    StringBuffer sb = new StringBuffer();
    int x = Integer.MAX_VALUE;

}
