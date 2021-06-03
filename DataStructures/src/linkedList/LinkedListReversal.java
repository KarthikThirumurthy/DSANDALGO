package linkedList;

import linkedList.LinkedList.Node;

public class LinkedListReversal {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(4, list);
		list.add(5, list);
		list.add(6, list);
		list.add(7, list);
		Node result= reverse(list.head);

		print(result);

	}

	static void print(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	private static Node reverse(Node node) {
		
		Node current = node;
		Node previous = null;//This pointer is used to chain the previous node
		Node next;

		while (current != null) {

			next = current.next;
			current.next = previous; 
			previous = current;
			current = next;

		}

		node = previous;
		return node;

	}

}
