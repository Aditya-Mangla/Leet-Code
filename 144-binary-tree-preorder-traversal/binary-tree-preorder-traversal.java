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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null ) return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        treeTraversal(root , list);
        return list;
    }
    public void treeTraversal(TreeNode root , ArrayList<Integer> list){
        if(root == null){
            return; 
        }
        list.add(root.val);
        treeTraversal(root.left , list);
        treeTraversal(root.right , list);

    }
    
}