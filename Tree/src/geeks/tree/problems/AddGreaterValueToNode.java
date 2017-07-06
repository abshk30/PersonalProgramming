package geeks.tree.problems;

import com.tree.Node;
import com.tree.Tree;
import com.tree.problems.TreeProblem;

public class AddGreaterValueToNode {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.addNode(6);
		tree.addNode(8);
		tree.addNode(4);
		tree.addNode(3);
		tree.addNode(5);
		tree.addNode(7);
		tree.addNode(10);
		tree.addNode(9);
		tree.addNode(11);
		//tree.addNode(2);
		TreeProblem.printTree(tree.root);
		System.out.println();
		
		addGrtValueToNode(tree.root);
		

	}
	static int num =0;

	static void addGrtValueToNode(Node node) {
		if (node == null) {
			return;
		}
		addGrtValueToNode(node.rightNode);

		node.data += num;
		num = node.data;
		System.out.println(node.data);
		addGrtValueToNode(node.leftNode);

	}

	
}
