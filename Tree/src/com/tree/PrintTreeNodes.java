package com.tree;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PrintTreeNodes {

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

		// fullNode(tree.root);
	//	deepestNode(tree.root);
	//	verticalTraversal(tree.root);
//		kThSumPath(tree.root,9);
	//	maxElementBtwTwoNode(tree.root,new Node(2), new Node(9));
		
		kthSmallestElement(tree.root, 4);
		//closestElement(tree.root, 1);
	}

	public static void fullNode(Node node) {

		if (node == null) {
			return;
		}
		fullNode(node.leftNode);
		fullNode(node.rightNode);
		if (node.leftNode != null && node.rightNode != null) {
			System.out.println(node.data);
		}
	}

	public static void deepestNode(Node node) {

		deepestNodeH(node, 0);
		System.out.println("maxLevel :: " + maxLevel);
		System.out.println((deepestNode == null) ? "null" : deepestNode.data
				+ "");
	}

	public static Node deepestNode = null;
	public static int maxLevel;

	public static void deepestNodeH(Node node, int horizontalLevel) {
		if (node == null) {
			return;
		}
		deepestNodeH(node.leftNode, horizontalLevel + 1);
		deepestNodeH(node.rightNode, horizontalLevel + 1);

		if (horizontalLevel > maxLevel) {
			maxLevel = horizontalLevel;
			deepestNode = node;
		}

	}

	

	public static void verticalTraversal(Node node) {
		TreeMap<Integer, String> hashmap = new TreeMap<Integer, String>();
		verticalTraversalH(node ,0, hashmap);
		Set<Entry<Integer,String>> entrySet = hashmap.entrySet();
		for(Entry<Integer,String> entry : entrySet){
			System.out.println(entry.getValue());
		}
	}

	private static void verticalTraversalH(Node node,int verticalLevel ,TreeMap<Integer,String> map) {
		if(node == null) return ;
		verticalTraversalH(node.leftNode, verticalLevel-1,map);
		verticalTraversalH(node.rightNode, verticalLevel+1,map);
		if(map.get(verticalLevel) != null){
			String value = map.get(verticalLevel);
			value = value + " "+node.data;
			map.put(verticalLevel, value);
		}else{
			map.put(verticalLevel, node.data+"");
		}
	}
	
	static int pathIndex = 0;
	static int kthSumVar =0;
	public static void kThSumPath(Node node,int kThSum){
		int path[] = new int[1000];
		kthSumVar =kThSum;
		kThSumPathH(node , path,kThSum );
	}

	private static void kThSumPathH(Node node, int[] path, int kthSum) {
		if(node == null) return;
		kThSumPathH(node.leftNode, path,kthSum);
		path[pathIndex++]=node.data;
		kthSumVar = kthSumVar-node.data;
		if(kthSumVar ==0){
			printPath(path);
			System.out.println();
			pathIndex=0;
			kthSumVar =kthSum;
		}else if(kthSumVar <0){
			kthSumVar =kthSum;
			pathIndex=0;
		}
		kThSumPathH(node.rightNode, path,kthSum);
	}

	private static void printPath(int[] path) {
		for (int i = 0; i < pathIndex; i++) {
			System.out.print(path[i]+" ");
		}
		
	}
	static int maxNodeElement;
	static boolean flag; 
	
	public static void maxElementBtwTwoNode(Node root,Node firstNode,Node lastNode){
		maxElementBtwTwoNodeH(root,firstNode,lastNode);
		System.out.println("maxElement :: "+maxNodeElement);
	}

	private static void maxElementBtwTwoNodeH(Node node, Node firstNode,
			Node lastNode) {
		if(node == null) return;
		if(node.data == lastNode.data){
			flag = true;
		}
		maxElementBtwTwoNodeH(node.leftNode, firstNode, lastNode);
		if(node.data >maxNodeElement && !flag){
			maxNodeElement = node.data;
		}
		if(!flag)
		maxElementBtwTwoNodeH(node.rightNode, firstNode, lastNode);
	}
	static int k ;
	static int smallestKthSUM;
	public static void kthSmallestElement(Node node , int kth){
		k=kth;
		kthSmallestElementH(node);
		System.out.println("smallestKthSUM :: "+smallestKthSUM);
	}

	private static void kthSmallestElementH(Node node) {
		if(node == null) return;
		kthSmallestElementH(node.leftNode);
		if(!flag)
			smallestKthSUM = smallestKthSUM + node.data;
		k=k-1;
		if(k==0){
			flag=true;
		}
		if(!flag)
		kthSmallestElementH(node.rightNode);
	}
	
	static int closestElement;
	static int differnce;
	public static void closestElement(Node node, int value){
		differnce=value;
		closestElementH(node,value);
		System.out.println("closestElement :: "+closestElement);
	}

	private static void closestElementH(Node node, int value) {
		if(node == null) return;
		closestElementH(node.leftNode, value);
		int diff = value - node.data;
		if( diff< 0){
			diff = 0- diff;
		}
		if(!flag ||diff< differnce){
			differnce =diff;
			closestElement = node.data;
			flag= Boolean.TRUE;
		}
		closestElementH(node.rightNode, value);
	}
	
}