package geeks.tree.problems;

import com.tree.Node;
import com.tree.Tree;
import com.tree.problems.TreeProblem;

public class BST_DiffBTW2Node {

	
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.addNode(6);
		tree.addNode(8);
		tree.addNode(5);
		tree.addNode(3);
		tree.addNode(4);
		tree.addNode(7);
		tree.addNode(10);
		tree.addNode(9);
		tree.addNode(11);
		tree.addNode(2);
		TreeProblem.printTree(tree.root);
		System.out.println("Node Difference :: " + nodeDiffernce(tree.root, 2, 9));
		
	}
	
	public static int nodeDiffernce(Node node, int n1, int n2) {
		
		if(node == null) {
			return 0;
		}else if(node.data > n1 && node.data > n2) {
			return nodeDiffernce(node.leftNode, n1, n2);
		}else if(node.data < n1 && node.data < n2 ) {
			return nodeDiffernce(node.rightNode, n1, n2);
		}else {
			return nodeDistance(node.leftNode, n1) + nodeDistance(node.rightNode, n2);
		}
	}
	
	public static int nodeDistance(Node node, int value) {
		if( node.data == value) {
			return 1;
		}
		if(node.data < value) {
			return 1 + nodeDistance(node.rightNode, value);
		}else {
			return 1 + nodeDistance(node.leftNode, value);
		}
	}
}
