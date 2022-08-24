package binaryTree;

public class IdenticalTrees extends BinaryTree {
	
	
	 public static void main(String[] args)
	    {
	        BinaryTree tree = new BinaryTree();
	  
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	   
	        BinaryTree tree2 = new BinaryTree();
	        tree2.root = new Node(1);
	        tree2.root.left = new Node(2);
	        tree2.root.right = new Node(3);
	        tree2.root.left.left = new Node(4);
	        tree2.root.left.right = new Node(5);
	  
	        try {
				if (identicalTrees(tree.root, tree2.root))
				    System.out.println("Both trees are identical");
				else
				    System.out.println("Trees are not identical");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  
	    }
	 
	 public static boolean identicalTrees(Node node1, Node node2) {
			// TODO Auto-generated method stub
		 
		 if (node1 == null && node2 == null)
	            return true;
			if(node1!=null && node2!=null)
			
			return ( node1.data==node2.data &&
				identicalTrees(node1.left, node2.left) &&
				identicalTrees(node1.right, node2.right));
			
				
			return false;
		}

}
