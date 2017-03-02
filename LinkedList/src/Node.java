
public class Node {
	private int data;
	private Node previous, next;
	
	Node(int d){
		data = d;
		previous = null;
		next = null;
	}
	
	public void setData(int newData){
		data = newData;
	}
	
	public void setPrevious(Node prevNode){
		previous = prevNode;
	}
	
	public void setNext(Node nextNode){
		next = nextNode;
	}
	
	public Node getNext(){
		return next;
	}
	
	public Node getPrevious(){
		return previous;
	}
	
	public void print(){
		System.out.print("<--" + data);
	}
}
