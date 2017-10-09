package geeks.tree.problems;

import com.tree.Node;
import com.tree.Tree;
import com.tree.problems.TreeProblem;

public class RemoveLeafNodeBST {

	public static void main(String[] args) {
		
		Tree tree1 = new Tree();
		tree1.addNode(10);
		tree1.addNode(6);
		tree1.addNode(15);
		tree1.addNode(3);
		tree1.addNode(8);
		tree1.addNode(11);
		tree1.addNode(18);
		TreeProblem.printTree(tree1.root);
		deleteLeafNode(tree1.root);
		System.out.println();
		TreeProblem.printTree(tree1.root);
		
		
	}
	

	public static void deleteLeafNode( Node node) {
	
		if(node == null) {
			return ;
		}
		
		if(node.leftNode != null && node.leftNode.leftNode != null && node.leftNode.rightNode != null) {
			
			deleteLeafNode(node.leftNode);
		}else {
			node.leftNode =null;
		}
		
		if(node.rightNode != null && node.rightNode.leftNode != null && node.rightNode.rightNode != null) {
			deleteLeafNode(node.rightNode);
		}else {
			node.rightNode =null;
		}
		
		
	}
	
}
