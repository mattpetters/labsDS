/*
 * 1)Implement Doubly linked list deletion which should be done for alternate nodes.

Eg:

1<--> 2 <-->3<--> 4<--> 5<--> 6

Output: 1 <-->3 <-->5

Do not use the List Interfaces. Implement your own Doubly Linked List.

2)

Add a new Node (sum of first and last node of previous result)to the end of the End list of 1

eg:

1 <-->3 <-->5 <--> 6
 */
public class SinglyLinkedList {
	
	protected Node head;
	protected Node tail;
	
	SinglyLinkedList(){
		
	}
	
	public void addNode(int element){
		
		Node node = new Node(element);
		if(head == null){
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}
	
	public void printNodes(){
		Node node = head;
		while(true){
			if(node == null){
				break;
			}
			node.print();
			node = node.getNext();
		}
	}
}
