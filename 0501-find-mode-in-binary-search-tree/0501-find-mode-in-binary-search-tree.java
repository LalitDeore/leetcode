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
    private int maxCount = 0;
    private List<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> countMap = new HashMap<>();
        inorderTraversal(root, countMap);

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            if (count == maxCount) {
                modes.add(entry.getKey());
            } else if (count > maxCount) {
                maxCount = count;
                modes.clear();
                modes.add(entry.getKey());
            }
        }

        return modes.stream().mapToInt(Integer::intValue).toArray();
    }

    private void inorderTraversal(TreeNode root, Map<Integer, Integer> countMap) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, countMap);

        countMap.put(root.val, countMap.getOrDefault(root.val, 0) + 1);

        inorderTraversal(root.right, countMap);
    }
}