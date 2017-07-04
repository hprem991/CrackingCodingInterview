package DataStructure;

class Node{
	int data;
	Node next;
	
	Node(Node node){
		this.data = node.data;
		this.next = node.next;
	}
}

public class DetectCycle {
	public boolean hasCycle(Node head) {
		Node snail = head;
		Node rabbit = head;
		while((snail != null) && (rabbit != null) && (rabbit.next != null)){
			snail = snail.next;
		 	rabbit = rabbit.next.next;
			if(rabbit == snail)
				return true;
		}
		return false;
	}

}
