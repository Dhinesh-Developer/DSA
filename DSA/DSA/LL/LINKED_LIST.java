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
	private static Node head;
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
	
	public static Node insertHead(Node head,int val) {
		Node temp = new Node(val,head);
		return temp;
	}
	
	public static Node insertTail(Node head,int val) {
		if(head == null) {
			Node temp = new Node(val);
			return temp;
		}
		Node temp = head;
		while(head.next!=null) {
			temp = temp.next;
		}
		Node newNode = new Node(val);
		temp.next = newNode;
		return newNode;
	}
	
	public static Node insertPostition(Node head,int val,int k) {
		if(head == null) {
			if(k==1) {
				Node temp = new Node(val);
			}else {
				return head;
			}
		}
		if(k==1) {
			Node temp = new Node(val,head);
			return temp;
		}
		int cnt = 1;
		Node temp = head;
		while(temp!=null) {
			cnt++;
			if(cnt == k-1) {
				Node x = new Node(val,temp.next);
//				x.next = temp.next;
				temp.next = x;
				break;
			}
			temp = temp.next;
		}
		return head;
	}
	public static void main(String[] args) {
		int[] ar = {2,5,6,8};
/*
 * 		
//		Node y = new Node(ar[0]);
//		System.out.println(y.data);
		
		Node head = convertArr2LL(ar);
		//System.out.println(head.data);
		//System.out.println(head.next.data);
		Traversal(head);
		int lenght = LengthOfLL(head);
		System.out.println(lenght);
		
		int res = checkPresent(head, 5);
//		System.out.println(res);
		
		head = insertHead(head, 100);
//		System.out.println(head.data);
		Traversal(head);
 */
		Node head = convertArr2LL(ar);
		insertPostition(head, 100, 4);
		Traversal(head);
	}

}
