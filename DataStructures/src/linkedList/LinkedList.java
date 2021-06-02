package linkedList;

public class LinkedList {

	 Node head;  //This will be head pointer for linked List
	
	/**
	 * Creating inner class Node.
	 */
	static class Node{
		
		Node next;
		int data;
		Node(Node next, int data){
			this.next=next;
			this.data=data;
		}
	}
	
	/**
	 * 
	 * @param i - integer to be added to the List 
	 * @param list- List for which the integer has to be added to
	 * @return  updated list with added Integer
	 */
	private static LinkedList add(int i, LinkedList list) {
		
		/**Create new node based on data passed and check if the head is not null.
		 * if head is not null traverse and find the last node and add the new Node.
		 */
		
		Node nodeToBeAdded = new Node(null, 5);
		if (list.head == null) {
			list.head = nodeToBeAdded;
		} else {

			Node tempNode=list.head;
			while(tempNode!=null) {
				tempNode=tempNode.next;
			}
			tempNode.next= nodeToBeAdded;
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		LinkedList list= new LinkedList();
		add(4,list);
		add(5,list);
		print(list);
	}

	private static void print(LinkedList list) {
		
		Node current= list.head;
		while(current!=null) {
			System.out.println(current.data);
			current= current.next;
		}
	}



	
}
