package binaryTree;

public class BinaryTree {
	
	/**
	 * Print post order traversal
	 */
	Node root;
	
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(
                "\nPostorder traversal of binary tree is ");
            tree.printPostOrderTraversal(tree.root);
 
	}
	
	
	public void printPostOrderTraversal(Node node) {
		
		if(node==null)
			return;
		
		printPostOrderTraversal(node.left);
		printPostOrderTraversal(node.right);
		System.out.print(node.data + " ");
		
		
	}

}

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}