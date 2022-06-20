package recursion;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        int k = 3;
        System.out.println(1 << k);
        PriorityQueue<Integer> que = new PriorityQueue<>(((o1, o2) -> o1 - o2));
        Map<Integer,Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();

    }
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        for(int i = 0; i < n ; i++){
            map.put(inorder[i],i);
        }
        return buildTree1(preorder,inorder, 0 , n - 1, 0 , n - 1);
    }
    TreeNode buildTree1(int[] preorder,int[] inorder,int pl,int pr,int il,int ir){
        int node = preorder[0];
        TreeNode root = new TreeNode(node);
        int index = map.get(node);
        int leftLen = index - il;
        root.right = buildTree1(preorder,inorder,pl + leftLen + 1,pr,index + 1,ir);
        root.left = buildTree1(preorder,inorder,pl + 1,pl + leftLen + 1,il,index);
        return root;
    }
    public int[] findMode(TreeNode root){
        Map<Integer,Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        map.put(root.val,1);
        while(!map.isEmpty()){
            if(root.left != null) map.put(root.left.val,map.getOrDefault(root.left.val,0) + 1);
            if(root.right != null) map.put(root.right.val,map.getOrDefault(root.right.val,0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            if(map.get(key) > max) {
                max = map.get(key);
                list.clear();
                list.add(key);
            }
            else if(map.get(key) == max) list.add(key);
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size() ; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }