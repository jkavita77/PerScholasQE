 package linkedlist;

public class SinglyLinkedList {
	private Node head;
 
	// used to insert a node at the start of linked list
	public void addNode(int data) {
		Node newNode = new Node();
		newNode.value = data;
		newNode.nextNode = head;
		head = newNode;
	}
 
	// For printing Linked List
	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.nextNode;
		}
		System.out.println();
	}
}