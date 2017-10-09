package geeks.tree.problems;

import com.tree.Node;
import com.tree.Tree;

public class LargestNumberInBST {

	public static void main(String[] args) {
		
		Tree tree1 = new Tree();
		tree1.addNode(10);
		tree1.addNode(6);
		tree1.addNode(15);
		tree1.addNode(3);
		tree1.addNode(8);
		tree1.addNode(11);
		tree1.addNode(18);
		
		largestInBST(tree1.root, 4);

	}
	
	public static void largestInBST(Node node , int value) {
		
		int largestValue = largestInBSTHelper(node, value, -1);
		System.out.println(largestValue);
	}

	private static int largestInBSTHelper(Node node, int value, int largertsValue) {
		if(node == null) {
			return largertsValue;
		}
		
		if((node.data < value && node.rightNode == null) || node.data < value && node.rightNode.data > value) {
			return node.data;
		}
		if(node.data > value) {
			return largestInBSTHelper(node.leftNode, value, largertsValue);
		}else  {
			return largestInBSTHelper(node.rightNode, value, largertsValue);
		}
		
	}
	

}
