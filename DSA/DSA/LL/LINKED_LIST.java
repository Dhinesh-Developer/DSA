package com.LL;
class Node{
	int data;
	Node next;
	
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
}
public class LINKED_LIST {
	public static Node convertArr2LL(int[] ar) {
		Node head = new Node(ar[0]);
		Node mover = head;
		for(int i=1;i<ar.length;i++) {
			Node temp = new Node(ar[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	public static int LengthOfLL(Node head) {
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void Traversal(Node head) {
		Node temp =head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp= temp.next;
		}
	}
	
	public static int checkPresent(Node head,int val) {
		Node temp = head;
		while(head!=null) {
			if(temp.data == val) {
				return 1;
			}
			temp = temp.next;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] ar = {2,5,6,8};
//		Node y = new Node(ar[0]);
//		System.out.println(y.data);
		
		Node head = convertArr2LL(ar);
		//System.out.println(head.data);
		//System.out.println(head.next.data);
		Traversal(head);
		int lenght = LengthOfLL(head);
		System.out.println(lenght);
		
		int res = checkPresent(head, 5);
		System.out.println(res);
	}

}
