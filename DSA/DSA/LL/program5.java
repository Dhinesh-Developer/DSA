package com.LL;

import java.util.Stack;

public class program5 {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	class Solution {
	    public boolean isPalindrome(ListNode head) {
	        ListNode temp = head;
	        Stack st;
	        while(temp!=null){
	            st.push(temp.data);
	            temp = temp.next;
	        }
	        ListNode temp = head;
	        st.top = null;
	        while(temp.data != st.top){
	            return false;
	            temp = temp.next;
	            st.top--;
	        }
	        return true;

	    }
	}
}
