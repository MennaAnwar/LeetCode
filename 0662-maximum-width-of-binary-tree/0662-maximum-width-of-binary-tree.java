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
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        root.val = 1;  //the level 0 has only 1 treenode
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int first = 0, last = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                //Record the val of the start and end nodes of each layer
                if (i == 0) {first = node.val;}
                if (i == size - 1) {last = node.val;}
                
                //update the left treenode's val
                if (node.left != null) {
                    node.left.val = node.val * 2 - 1;
                    queue.offer(node.left);
                } 
                //update the right treenode's val
                if (node.right != null) {
                    node.right.val = node.val * 2;
                    queue.offer(node.right);
                }   
            }
            //Update the maximum width
            maxWidth = Math.max(last-first+1, maxWidth);
        }
        return maxWidth;
    }
}