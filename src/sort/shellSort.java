package sort;

import java.util.Arrays;

public class shellSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 4, 8, 9, 7};
        System.out.println("排序前的序列：" + Arrays.toString(arr));
        shell(arr);
        System.out.println("堆排序的结果：" + Arrays.toString(arr));
    }
    public static void shell(int[] arr) {
        for(int gap = arr.length / 2; gap > 0 ; gap = gap / 2){ // 控制增量，默认从数组长度的一半开始，每次减半，直到只比较相邻元素的最后一趟排序为止
            for (int i = 0; i < arr.length; i++) { // 内层就是排序算法
                int value = arr[i];
                int index = i - 1; // 找到待插入位置的前一个元素的下标
                while(index >= 0 && value < arr[index]){ // 后移
                        arr[index + 1] = arr[index];
                        index--;
                    }
                arr[index + 1] = value;// 找到待插入位置
                }
            }
        }
    }

