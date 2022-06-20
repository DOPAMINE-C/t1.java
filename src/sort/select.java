package sort;

import java.util.Arrays;

public class select {
    public static void main(String[] args){
        int[] arr = {2, 5, 6, 4, 8, 9, 7};
        System.out.println("排序前的序列：" + Arrays.toString(arr));
        Select(arr);
        System.out.println("堆排序的结果：" + Arrays.toString(arr));
    }
    public static void Select(int[] arr){
            for(int i = 0 ; i < arr.length - 1; i++){ // 控制趟数，因为剩最后一个元素不用排，所以趟数比数组长度小 1
                int index = i; // 记录当前最小元素的下标,默认从第一个元素开始
                for(int j = i + 1; j < arr.length - i - 1; j++){
                    if(arr[j] < arr[index]) index = j; // 更新记录值
                }
                // 找到最小值后，放到最左边
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
        }
    }

