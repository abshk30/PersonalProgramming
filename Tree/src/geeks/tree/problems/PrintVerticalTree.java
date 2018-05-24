package geeks.tree.problems;

import java.util.TreeMap;

import com.tree.Node;
import com.tree.Tree;
import com.tree.problems.TreeProblem;

public class PrintVerticalTree {

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
		TreeMap<Integer, String > map =new TreeMap<Integer, String>();
		travelsTree(tree.root,map,0);

		System.out.println(map);
	}

	private static void travelsTree(Node node, TreeMap<Integer, String> map,int index) {
		if(node == null) {
			return;
		}
		
		travelsTree(node.leftNode,map, index-1);
		if(map.get(index) != null) {
			map.put(index, map.get(index)+" "+ node.data);
		}else {
			map.put(index, ""+node.data);
		}
		travelsTree(node.rightNode,map, index+1);
		
	}

}
