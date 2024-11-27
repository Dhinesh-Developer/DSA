 package com.LL;
// Detect a loop in the ll or cycle in ll
 
  // Definition for singly-linked list.
  class ListNode1 {
       int val;
       ListNode1 next;
       ListNode1(int x) {
           val = x;
          next = null;
       }
   }
  
 public class program3 {
     public boolean hasCycle(ListNode1 head) {
         ListNode1 slow = head;
         ListNode1 fast = head;
         while(fast!=null && fast.next!=null){
             slow = slow.next;
             fast = fast.next.next;
             if(slow==head){
                 return true;
             }
         }
         return false;
     }
 }
