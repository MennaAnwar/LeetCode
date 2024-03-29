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
  public int kthSmallest(TreeNode root, int k) {
    final int leftCount = countNodes(root.left);

    if (leftCount == k - 1)
      return root.val;
    if (leftCount >= k)
      return kthSmallest(root.left, k);
    return kthSmallest(root.right, k - 1 - leftCount); // LeftCount < k
  }

  private int countNodes(TreeNode root) {
    if (root == null)
      return 0;
    return 1 + countNodes(root.left) + countNodes(root.right);
  }
}
