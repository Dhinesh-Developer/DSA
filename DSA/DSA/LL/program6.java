package com.LL;
/*
 * Problem Statement : Segregate even and odd nodes in LinkedList

Given a LinkedList of integers. Modify the LinkedList in such a way that in Modified LinkedList all the even numbers appear before all the odd numbers in LinkedList.

Also, note that the order of even and odd numbers should remain the same. 
 */
class Node1{
	int val;
	Node1 next;
	public Node1(int val, Node1 next) {
		super();
		this.val = val;
		this.next = next;
	}
	
	public Node1(int val) {
		this.val = val;
		this.next = null;
	}
	
}
public class program6 {
	static Node1 head,tail;
	public static Node1 printLL(Node1 head) {
		Node1 temp  =head;
		while(temp!=null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
		return head;
	}
	
	public static void InsertAtLast(int val) {
		Node1 x = new Node1(val);
		if(head==null) {
			head = x;
			tail = x;
		}
		else {
			tail = tail.next = x;
		}
	}
	
	public static Node1 segrateOddEven() {
		Node1 oddLL = new Node1(-1);
		Node1 EvenLL = new Node1(-1);
		Node1 cur = head,temp;
		while(cur!=null) {
			 temp = cur;
		     cur = cur.next;
		     temp.next = null;
			if(temp.val%2!=0) {
				oddLL.next = temp;
				oddLL = temp;
			}else {
				EvenLL.next = temp;
				EvenLL = temp;
			}
		}
		EvenLL.next = oddLL.next;
		return EvenLL.next;
	}
	public static void main(String[] args) {
		
		InsertAtLast(1);
		InsertAtLast(2);
		InsertAtLast(3);
		InsertAtLast(4);
	    System.out.println("Intial LinkedList : ");
	    printLL(head);
	    Node newHead = segrateOddEven();
	    System.out.println("LinkedList After Segregration ");
	    printLL(newHead);
	}

}
