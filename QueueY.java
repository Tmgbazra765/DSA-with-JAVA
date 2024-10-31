package basic;

public class QueueY {
	static class Queue{
		static int rear=-1;
		static int arr[];
		static int size;
		Queue(int n){
			arr= new int[n];
			this.size=n;
		}
		public static boolean isEmpty() {
			return rear==-1;
		}
		// enqueue || time complexity O(1) 
		public static void add(int data) {
			if(rear==size-1) {
				System.out.println("Queue is full ");
				return; 
			}
			rear++;
			arr[rear]=data;
		}
		// Dequeue || time complexity O(n) 
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int front = arr[0];
			for(int i= 0;i<rear;i++) {
				arr[i]=arr[i+1];
			}
			rear--;
			return front;
		}
		// peek || time complexity O(n) 
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return arr[0];
		}
		
	
	}
	public static void main(String[] args) {
		Queue queue= new Queue(10);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.peek());
			queue.remove();
		}
	}

}
