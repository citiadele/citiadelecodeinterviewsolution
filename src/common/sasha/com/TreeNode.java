package common.sasha.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {
	public TreeNode left ;
	public TreeNode right;
	public int val;

	public TreeNode(int val) {
		this.val = val ;
	}

	public static TreeNode createTree(Integer array []) {
		if ( array == null || array.length == 0) return null;
		return  createTree( array , 0);
	}

	
	public  static TreeNode createTree(Integer[] array, int ind) {
		if ( ind > array.length -1 ) {
		    return null;
		}
		int val = array[ind];
		TreeNode root = new TreeNode(val);
		int leftChildInd = 2*ind + 1;
		root.left = createTree(array, leftChildInd);
		root.right = createTree(array,leftChildInd +1 );
		return root;
	}
	
	public static List<Integer> printTree(TreeNode root) {
		List<Integer>queue = new ArrayList<>();
		if ( root == null ) {
			queue.add(null); 
			return queue;
		}
		insertNode(root, 0, queue);
		return queue;
	}

	private static void insertNode(TreeNode root, int ind, List<Integer> queue) {
		if ( root == null ) {
		    queue.add(ind,  null);  
		    return ;
		}
		queue.add( ind , root.val);
		int leftIndex = ind*2 + 1;
		insertNode(root.left , leftIndex, queue);
		insertNode(root.right, leftIndex + 1, queue );
	}
	
	
	public static void main(String arg []) {
	    Integer array [] = {10, 20, 30, 25, 26,35,36, 27, 28};
	    TreeNode root = createTree(array, 0);
	    List<Integer> list = printTree(root);
	    
	}
	
	
	
}
