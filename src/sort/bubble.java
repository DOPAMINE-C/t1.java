package sort;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args){
        int[] arr = {2, 5, 6, 4, 8, 9, 7};
        System.out.println("排序前的序列：" + Arrays.toString(arr));
        bubble(arr);
        System.out.println("堆排序的结果：" + Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){ // 控制趟数 , 趟数比数组长度小 1
            boolean flag = false; // 记录当前这趟 有没有发生交换
            for(int j = 0; j < arr.length - i - 1; j++){ // 元素两两比较,每趟最大的元素排到最后
                if(arr[j] > arr[j + 1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
            if(flag == false)break;
        }
    }
}
