package recursion;

import java.util.*;

public class t1 {
    public static void main(String[] args) {
        Map<Integer,Integer> map  = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ListNode dummy = new ListNode();
        int target = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        System.out.println(Arrays.toString(arr));
        System.out.println(minSubArrayLen(target,arr));;
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int slen = 0;
        int sum = 0;
        int i = 0;
        for(int j = 0;j < nums.length;j++){
            sum += nums[j];
            while( sum >= target){
                slen = j - i + 1;
                res = Math.min(res,slen);
                sum -= nums[i++];
            }
        }
        return res == Integer.MAX_VALUE? 0 : res;
    }
}
class ListNode {
    // 结点的值
    int val;

    // 下一个结点
    ListNode next;

    // 节点的构造函数(无参)
    public ListNode() {
    }

    // 节点的构造函数(有一个参数)
    public ListNode(int val) {
        this.val = val;
    }

    // 节点的构造函数(有两个参数)
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}