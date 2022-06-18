package binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BinaryTreeVerticalOrder extends BinaryTree {

	/**
	 * Logic to print binary tree in vertical order uses Map here Create a map of
	 * distance and the values in that distance from root. Assume root to be 0.
	 */

	public static void main(String[] args) {
		BinaryTreeVerticalOrder tree = new BinaryTreeVerticalOrder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printBinaryTreeVerticalOrder(tree.root);
	}

	void printBinaryTreeVerticalOrder(Node root) {

		Map<Integer, List<Integer>> map = new HashMap<>();
		printBinaryTreeVerticalOrderUtiltiy(root, 0, map);
		for (Entry<Integer, List<Integer>> e : map.entrySet()) {
			System.out.println(e.getValue());
		}
	}

	private static void printBinaryTreeVerticalOrderUtiltiy(Node node, int distance, Map<Integer, List<Integer>> map) {
		// TODO Auto-generated method stub
		List<Integer> values = map.get(distance);
		if (values != null) {
			values.add(node.data);

		} else {
			values = new ArrayList<>();
			values.add(node.data);

		}
		map.put(distance, values);
		
		printBinaryTreeVerticalOrderUtiltiy(node.left,distance-1,map);
		printBinaryTreeVerticalOrderUtiltiy(node.right, distance+1, map);
		
	}
}
