package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBottomView extends BinaryTree {
	
	public static void main(String[] args) {
		BinaryTreeBottomView tree = new BinaryTreeBottomView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        printBottomView(tree.root);
       
	}

	private static void printBottomView(Node root) {
		// TODO Auto-generated method stub
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			
			Node temp=q.poll();
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
			
			if(temp.left==null&&temp.right==null)
				System.out.println(temp.data);
		}
	}

}
