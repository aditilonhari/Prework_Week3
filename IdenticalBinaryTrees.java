/*
Problem Statement : Given two binary trees, write a function to check if they are equal or not. Return 0 / 1 ( 0 for false, 1 for true ) for this problem
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

	public int isSameTree(TreeNode a, TreeNode b) {
	    
	    if(a == null && b == null)
	        return 1;
	   
	   if(a == null || b == null)
	        return 0;
	        
	    
	   return ((a.val == b.val) && (isSameTree(a.left, b.left) == 1) && (isSameTree(a.right, b.right) == 1)) ? 1 : 0;   
	}
	
}

