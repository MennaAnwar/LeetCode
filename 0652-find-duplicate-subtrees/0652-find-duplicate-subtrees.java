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
  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    List<TreeNode> ans = new ArrayList<>();
    Map<String, Integer> count = new HashMap<>();
    dfs(root, count, ans);
    return ans;
  }

  private String dfs(TreeNode root, Map<String, Integer> count, List<TreeNode> ans) {
    if (root == null)
      return "";

    final String dfsd =
        root.val + "#" + dfs(root.left, count, ans) + "#" + dfs(root.right, count, ans);
    count.merge(dfsd, 1, Integer::sum);
    if (count.get(dfsd) == 2)
      ans.add(root);
    return dfsd;
  }
}
