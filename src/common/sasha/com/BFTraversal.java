package common.sasha.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class BFTraversal {


    
	public static void main(String arg []) {
    	
    }
	
	public static List<List<Integer>> traverse(TreeNode node) {
		if ( node == null ) {
			throw new IllegalArgumentException("input is invalid" + node);
		}
		LinkedList<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> res = new ArrayList<>();
	    queue.add(node);
	    while ( !queue.isEmpty()) {
	         int levelSize = queue.size();
	         List<Integer> level = new ArrayList<>();
	         while ( levelSize >=0 ) {
	        	TreeNode cur = queue.pop();
	        	level.add(cur.val);
	        	levelSize--;
	        	if ( cur.left != null ) queue.add(cur.left);
	        	if ( cur.right != null ) queue.add(cur.right);
	         }
	         res.add(level);
	    }
		
		return res;
	}
}
