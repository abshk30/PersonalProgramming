package geeks.tree.problems;

import java.util.Calendar;

import com.tree.Node;
import com.tree.Tree;

public class ConstructBSTAndCountPair {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		tree.addNode(5);
		tree.addNode(3);
		tree.addNode(7);
		tree.addNode(2);
		tree.addNode(4);
		tree.addNode(6);
		tree.addNode(8);
		
		Tree tree1 = new Tree();
		tree1.addNode(10);
		tree1.addNode(6);
		tree1.addNode(15);
		tree1.addNode(3);
		tree1.addNode(8);
		tree1.addNode(11);
		tree1.addNode(18);
		Calendar sTime = Calendar.getInstance();
		searchPairNode(tree.root, tree1.root, 13);
		Calendar eTime = Calendar.getInstance();
		System.out.println((eTime.getTimeInMillis() - sTime.getTimeInMillis()));
		
	}
	
	public static void searchPairNode(Node node1, Node node2 , int value) {
		
		if(node1 == null) {
			return;
		}
		popNodeInBST1(node1,node2 , value);
		
	}
	private static void popNodeInBST1(Node node ,Node node1, int value) {
		if(node == null) {
			return ;
		}
		searchNodeinBST2(node1 , value - node.data, value );
		popNodeInBST1(node.leftNode ,node1 ,value);
		popNodeInBST1(node.rightNode,node1, value);
	}

	public static void searchNodeinBST2(Node node , int value ,int sumValue) {
		if(node == null) {
			return ;
		}
		if( node.data == value) {
			System.out.print("{"+(sumValue - node.data)+" ,"+ value+"} ");
			return;
		}
		searchNodeinBST2(node.leftNode , value , sumValue);		
		searchNodeinBST2(node.rightNode , value , sumValue);
		
	}
}
