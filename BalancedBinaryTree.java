/*
Problem Statement : Given a binary tree, determine if it is height-balanced. Return 0 / 1 ( 0 for false, 1 for true ) for this problem
*/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public int isBalanced(TreeNode a) {
	    
	    if(a == null)
	        return 1;
	   
	    int left = height(a.left);
	    int right = height(a.right);
	    
	    return ((Math.abs(right - left) <= 1) && (isBalanced(a.left) == 1) && (isBalanced(a.right) == 1))? 1 : 0;
	     
	}
	
	public int height(TreeNode n){
	    
	    if(n == null)
	        return 0;
	        
	   return 1 + Math.max(height(n.left), height(n.right));     
	}
}

