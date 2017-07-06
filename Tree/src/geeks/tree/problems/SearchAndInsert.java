package geeks.tree.problems;

import com.tree.Node;
import com.tree.Tree;
import com.tree.problems.TreeProblem;

public class SearchAndInsert {

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
		//System.out.println(searchValue(tree.root, 2));;
		insetValue(tree.root, 2);
		System.out.println();
		TreeProblem.printTree(tree.root);
	}
	
	public static boolean valueExits = Boolean.FALSE;
	
	public static boolean searchValue(Node node,int value){
		searchValueHepler(node , value);
		return valueExits;
	}

	private static void searchValueHepler(Node node, int value) {
		
		if(node == null) return ;
		if(value == node.data){
			valueExits = Boolean.TRUE;
			return;
		}else if( value < node.data){
			 searchValueHepler(node.leftNode, value);
		}else if( value > node.data){
			 searchValueHepler(node.rightNode, value);
		}
	}
	
	public static void insetValue(Node node, int value){
		if(node == null){
			node = new Node(value);
			return ;
		}
		if(value < node.data ){
			node.leftNode  = insertValueHelper(node.leftNode, value);
		}else{
			node.rightNode =  insertValueHelper(node.rightNode, value);
		}
		//insertValueHelper(node , value);
	}

	private static Node insertValueHelper(Node node, int value) {
		if(node == null){
			node = new Node(value);
			return node;
		}
		if(value < node.data ){
			node.leftNode  = insertValueHelper(node.leftNode, value);
			return node;
		}else{
			node.rightNode =  insertValueHelper(node.rightNode, value);
			return node;
		}
	}
	
	
}
