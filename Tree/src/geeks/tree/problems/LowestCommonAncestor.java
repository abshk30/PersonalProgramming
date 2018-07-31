package geeks.tree.problems;

import java.util.ArrayList;
import java.util.List;

import com.tree.Node;
import com.tree.Tree;
import com.tree.problems.TreeProblem;

public class LowestCommonAncestor {

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
		/*System.out.println();
		System.out.print("\n\nLCD value is ::  ");
		
		Node n = findLowestCommonAncestor(tree.root, 3, 5);
		System.out.print(n.data);*/
		
		findKthSmallestElementBST(tree.root, 3);
		try {Node n1 = count.get(6);
		System.out.println(n1 != null ? n1.data: "Not found");
		}catch(Exception e){
			System.out.println("Not Found");
		}
	}
	
	public static Node findLowestCommonAncestor(Node node, int n1, int n2) {
		
		if(node == null){
			return null;
		}
		if(node.data >n1 && node.data >n2){
			return findLowestCommonAncestor(node.leftNode, n1, n2);
		}
		
		if(node.data <n1 && node.data <n2){
			return findLowestCommonAncestor(node.rightNode, n1, n2);
		}
		
		return node;
	}
	
	static List<Node> count = new ArrayList<Node>() ;
	public static void findKthSmallestElementBST(Node node, int Kth){
		
		if(node == null){
			return ;
		}
		findKthSmallestElementBST(node.leftNode, Kth);
		count.add(node);
		
		findKthSmallestElementBST(node.rightNode, Kth);
		
	}
}
