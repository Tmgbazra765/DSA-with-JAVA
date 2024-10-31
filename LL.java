package basic;
class LL{
	private int size;
	LL(){
		size=0;
	}
	Node head;
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
			size++;
		}
		
	}
	// adding element to the first part in Linked list
	public void addFirst(String data) {
		
		Node newNode= new Node(data);
		
		// corner cases; 
		if(head==null) {
			head=newNode;
			return;
			
		}
		newNode.next=head;
		head=newNode;
	}
	
	// adding element to the last part in Linked List;
	public void addLast(String data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currentNode=head;
		while(currentNode.next!=null) {
			currentNode=currentNode.next;
		}
		currentNode.next=newNode;
	}
	// printing the linked list ; 
	public void printList() {
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		Node currentNode=head;
		
		while(currentNode!=null) {
			System.out.print( currentNode.data + "->");
			currentNode= currentNode.next;
		}
		System.out.print("Null");
	}
	
	public void deleteFirst() {
		if(head==null|| head.next==null) {
			System.out.print("List is empty");
			return;
		}
		head=head.next;
		size--;
	}
	public void deleteLast() {
		// corner casses
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		Node secondLastNode=head;
		Node lastNode=head.next;
		while(lastNode.next!=null) {
			
			lastNode=lastNode.next;
			secondLastNode=secondLastNode.next;
			
			
		}
		secondLastNode.next=null;
	}
	public int getSize() {
		return size;
	}
	
	
	public void reverseIterate() {
		if(head==null|| head.next==null) {
			return;
		}
		Node priviousNode=head;
		Node currentNode=head.next;
		while(currentNode!=null){
			Node nextNode=currentNode.next;
			currentNode.next=priviousNode;
			
			// updating
			priviousNode=currentNode;
			currentNode=nextNode;
		}
		head.next=null;
		head=priviousNode;
	}
	
	
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("a");
		list.addLast("is");
		
		
		list.addLast("list");
		list.addFirst("This");
		list.printList();
		System.out.println();
		
		list.deleteFirst();
		list.printList();
		System.out.println();
		System.out.println(list.getSize());
		System.out.println();
		list.reverseIterate();
		list.printList();
		
		
		
	}
}