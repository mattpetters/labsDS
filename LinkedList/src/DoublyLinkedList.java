
public class DoublyLinkedList extends SinglyLinkedList {
	public void printNodesInReverse(){
		Node node = tail;
		while(true){
			if(node == null){
				break;
			}
			node.print();
			node = node.getPrevious();
		}
	}
}
