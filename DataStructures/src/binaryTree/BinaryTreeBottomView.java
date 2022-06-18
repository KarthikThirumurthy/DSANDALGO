package binaryTree;

public class BinaryTreeBottomView extends BinaryTree {
	
	public static void main(String[] args) {
		BinaryTreeBottomView tree = new BinaryTreeBottomView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
       
	}

}
