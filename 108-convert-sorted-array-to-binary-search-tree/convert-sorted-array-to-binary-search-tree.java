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
    public TreeNode sortedArrayToBST(int[] nums){
        return buildTree(nums , 0 , nums.length-1);
    }
    public TreeNode buildTree(int nums[] , int left , int right){
        if(left>right){
            return null;
        }
        int mid = left+(right-left)/2;
        TreeNode head  = new TreeNode(nums[mid]);
        
            head.left = buildTree(nums , left , mid-1);
            head.right =  buildTree(nums , mid+1,right);
            

        
        return head;
    }
}