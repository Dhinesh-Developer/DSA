class Node{
	int data;
	Node next;
	public Node(int data,Node next) {
		this.data = data;
		this.next = next;
	}
	public Node(int data) {
		this.data  = data;
		this.next = null;
	}
}
public class linkedList {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		Node y = new Node(ar[3]);
		System.out.println(y.data);
	}

}
