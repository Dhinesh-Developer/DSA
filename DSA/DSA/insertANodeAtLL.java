import java.util.Arrays;
import java.util.List;
// Insert a Node at at position 
class Node{
	public int data;
	public Node next;
	public Node(int data,Node head) {
		this.data = data;
		this.next = next;
	}
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class insertANodeAtLL {
	public static void printLL(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node insertNode(Node head,int data) {
		Node temp = new Node(data,head);
		return temp;
	}
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(12,8,5,7);
		int val = 100;
		Node head = new Node(arr.get(0));
		head.next = new Node(arr.get(1));
		head.next.next = new Node(arr.get(2));
		head.next.next.next = new Node(arr.get(3));
		
		head = insertNode(head,val);
		printLL(head);
	}
//100 12 8 5 7 
}
