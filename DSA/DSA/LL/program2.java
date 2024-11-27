package com.LL;
// Reversea linked list  1.3.2.5.  output = 5.2.3.1
public class program2 {

	public static void main(String[] args) {
		
	}

}


  //Definition for singly-linked list.
  class ListNode {
      int val;
     ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next=prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
