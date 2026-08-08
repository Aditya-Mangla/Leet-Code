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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        inTraversal(root , list);
        return list;
    }
    public void inTraversal(TreeNode root , ArrayList<Integer> list){
        if(root == null)  return;
        inTraversal(root.left, list);
        list.add(root.val);
        inTraversal(root.right , list);
    }
}