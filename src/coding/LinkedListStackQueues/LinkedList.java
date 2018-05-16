package coding.LinkedListStackQueues;


public class LinkedList {
	LLNode head;
	
	
	
	void add_node_atHead (LLNode n) {
		n.next = this.head;
		this.head = n;
	}
	
	@Override
	public String toString() {
		String result = "{ ";
		
		LLNode curr = this.head;
		while (curr != null) {
			result = result + curr.data +" ";
			curr = curr.next;
		}
		result += " }";
		return result;
	}
	

 static void printLL(LLNode temp) {
	 
	 if ( temp == null) return;
	 
	 LLNode curr = temp;
	 String result = " {";
	 while ( curr != null ) {
		 System.out.println("Helllo");
		 result += curr.data + ", ";
	 }
	 System.out.println("printing current-> "+curr);
	 result = result + " }";
	 System.out.println(result);
 }
 
}

 class LLNode {
	int data;
	LLNode next;
	LLNode(int data) {
		this.data  = data;
	}
	
	@Override
	public String toString() {
		return "" + this.data;
	}
}