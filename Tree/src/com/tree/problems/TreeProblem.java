package com.tree.problems;

import com.tree.Node;
import com.tree.Tree;

public class TreeProblem {

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
		tree.addNode(2);
		printPath(tree.root);
	//	printTree(tree.root);
		//System.out.println();
	//	mirrorImage(tree.root);
		//System.out.println("Mirror Images ");
		//printTree(tree.root);
		/*findMinimumValue(tree.root);
		checkIsBST(tree.root);*/
	}
	
	private static void checkIsBST(Node node) {
		System.out.println(isBSTHelper(node));
	}
	private static boolean isBSTHelper(Node node) {
		if(node == null) return Boolean.FALSE;
		
		
		
		return true ;
	}
	static int minValue = 1000000;
	
	
	private static void findMinimumValue(Node node) {
		
		findMinimumValueHelper(node);
		System.out.println(minValue);
	}

	private static void findMinimumValueHelper(Node node) {
		if(node ==  null){
			return;
		}
		findMinimumValueHelper(node.leftNode);
		
		if(node.data <  minValue){
			minValue = node.data;
		}
		findMinimumValueHelper(node.rightNode);
	}

	private static void mirrorImage(Node node) {
		
		if(node == null){
			return;
		}
		mirrorImage(node.leftNode);
		mirrorImage(node.rightNode);
		
		Node temp = node.leftNode;
		node.leftNode = node.rightNode;
		node.rightNode = temp;
	}

	public static void printPath(Node node){
		int path[] = new int[100]; 
		printPathHelper(node,path,0);
	}


	private static void printPathHelper(Node node, int[] path, int pathLen) {
		
		if(node == null){
			return;
		}
		
		path[pathLen] = node.data;
		pathLen++;

		if(node.leftNode == null && node.rightNode == null){
			printPath(path,pathLen);
		}
		printPathHelper(node.leftNode, path, pathLen);
		printPathHelper(node.rightNode, path, pathLen);
	}


	private static void printPath(int[] path, int pathLen) {
		
		for (int i = 0; i < pathLen ; i++) {
			System.out.print(path[i]+" ");
		}
		System.out.println();
	}
	
	public static void  printTree(Node node){
		
		if(node == null){
			return ;
		}
		printTree(node.leftNode);
		System.out.print(node.data + " ");
		printTree(node.rightNode);
	}
}