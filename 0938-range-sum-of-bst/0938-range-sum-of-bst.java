/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.*;
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
       Queue<TreeNode> q = new LinkedList<>();
        if(root!=null) q.add(root);
        int ans = 0;
        while(q.size()>0){
            TreeNode temp = q.peek();
            if(temp.left !=null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            if(temp.val>=low && temp.val<=high){
                ans += temp.val;
            }
            q.remove();
        }
        return ans;
    }
}