package linkedList;

public class LinkedList {

	Node head; // This will be head pointer for linked List

	/**
	 * Creating inner class Node.
	 */
	static class Node {

		Node next;
		int data;

		Node(Node next, int data) {
			this.next = next;
			this.data = data;
		}
	}

	/**
	 * 
	 * @param i     - integer to be added to the List
	 * @param list- List for which the integer has to be added to
	 * @return updated list with added Integer
	 */
	 static LinkedList add(int i, LinkedList list) {

		/**
		 * Create new node based on data passed and check if the head is not null. if
		 * head is not null traverse and find the last node and add the new Node.
		 */

		Node nodeToBeAdded = new Node(null, i);
		if (list.head == null) {
			list.head = nodeToBeAdded;
		} else {

			Node tempNode = list.head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = nodeToBeAdded;
		}

		return list;
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		add(4, list);
		add(5, list);
		add(6, list);
		add(7, list);
		deleteNode(5, list);
		print(list);
	}

	private static void deleteNode(int i, LinkedList list) {
		// handling corner Cases
		if (list.head == null)
			return;

		Node node = list.head;
		Node previous = null;
		while (node != null) {

			if (node.data == i) {
				previous.next = node.next;
				break;
			}
			previous = node;
			node = node.next;

		}
	}

	static void print(LinkedList list) {

		Node current = list.head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}
