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
class Solution {
    
    public static void convertTreeToArray(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        convertTreeToArray(root.left, arr);
        arr.add(root.val);
        convertTreeToArray(root.right, arr);
    }

    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        convertTreeToArray(root, arr);

        TreeNode newRoot = new TreeNode();
        TreeNode current = newRoot;

        for (int val : arr) {
            current.right = new TreeNode(val);
            current = current.right;
        }

        return newRoot.right;
    }
}