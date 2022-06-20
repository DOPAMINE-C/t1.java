package sort;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 4, 8, 9, 7};
        System.out.println("排序前的序列：" + Arrays.toString(arr));
        quick(arr,0, arr.length- 1);
        System.out.println("堆排序的结果：" + Arrays.toString(arr));
    }
    public static void quick(int[] arr,int low,int high) {
        if(low > high){
            return;
        }
        int l = low, r = high , x = arr[low]; // 当前子数组的第一个元素为 分界点，默认从最左元素开始
        while (l < r) {
            //先看右边，依次往左递减，找比基准小的元素
            while (arr[r] >= x && l < r) r--;
            //再看左边，依次往右递增，找比基准大的元素
            while (arr[l] <= x && l < r) l++;
            //如果满足条件则交换
            if (l < r) {
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
            }
        }
        //更新基准，将基准为与 low 和 high 相等位置的数字交换
        arr[low] = arr[l];
        arr[l] = x;
        //递归调用左半数组
        quick(arr, low, r - 1);
        //递归调用右半数组
        quick(arr, r + 1, high);
    }
}
