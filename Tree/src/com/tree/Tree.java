package com.tree;

public class Tree {

	Node root;
	public void addNode(int data){
		root=addNodeH(root,data);
	}

	public Node addNodeH(Node node, int data){
		
		if(node == null){
			node =new Node(data);
			return node;
		}
		if(data<node.data){
			node.leftNode=addNodeH(node.leftNode, data);
		}else{
			node.rightNode=addNodeH(node.rightNode, data);
		}
		return node;
	} 
	
	
}
