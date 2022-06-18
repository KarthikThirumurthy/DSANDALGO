package binaryTree;

public class BinaryTreeDepth extends BinaryTree {

	public static void main(String[] args) {

		BinaryTreeDepth tree = new BinaryTreeDepth();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("\nPostorder traversal of binary tree is ");
		System.out.println(tree.printDepth(tree.root));

	}

	private int printDepth(Node node) {
		// TODO Auto-generated method stub
		
		if(node==null)
			return 0;
		
		int lmax= printDepth(node.left);
		int rmax= printDepth(node.right);
		if(lmax>rmax)
			return lmax+1;
		
		else
			return rmax+1;
		
	}
}