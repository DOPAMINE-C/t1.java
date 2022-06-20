package sort;

import java.util.Arrays;

public class insertSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 4, 8, 9, 7};
        System.out.println("排序前的序列：" + Arrays.toString(arr));
        insert(arr);
        System.out.println("堆排序的结果：" + Arrays.toString(arr));
    }
    public static void insert(int[] arr){
        for(int i = 0 ; i < arr.length; i++){ // 长度不减1，是因为要留多一个位置方便插入数
            int value = arr[i]; // 定义待插入的元素，默认从第一个元素开始
            int index = i - 1 ; // 定义待插入元素的前一个元素的下标，方便元素的插入
            while(index >= 0 && value < arr[index]){ // 待插入元素，和左边有序表的元素比较，寻找正确的插入位置
                arr[index + 1] = arr[index]; // 腾出待插入位置
                index--;
            }
            arr[index + 1] = value; // 出循环，代表找到待插入的位置，则插入元素即可
        }
    }
}
