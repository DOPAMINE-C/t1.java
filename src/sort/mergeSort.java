package sort;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int a[]={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        //int a[]={5,2,4,7,1,3,2,2};
        int temp[]=new int[a.length];
        merge(a,0,a.length-1,temp);
        System.out.println(Arrays.toString(a));
    }
    public static void merge(int[] arr,int l,int r,int[] temp){
        // 先分
        if(l < r){
            int mid = (l + r) >> 1;
            merge(arr,0,mid,temp);
            merge(arr,mid + 1,r,temp);
            // 分完之后，从左往右比较两个子数组，不停的将较小的元素，加入到辅助数组中
            int k = 0,i = l,j = mid + 1;
            while(i <= mid && j <= r){
                if(arr[i] <= arr[j]){
                    temp[k++] = arr[i++];
                }else temp[k++] = arr[j++];
            }
            while(i <= mid) temp[k++] = arr[i++]; // 如果左边子数组空了，则将剩余右边子数组加入辅助数组
            while(j <= r) temp[k++] = arr[j++]; // 如果左边子数组空了，则将剩余右边子数组加入辅助数组
            
            for(i = l,k = 0 ; i <= r ; i++,k++){ // 处理完后，将辅助数组的结果赋值到原数组中
                arr[i] = temp[k];
            }
        }
    }
}
