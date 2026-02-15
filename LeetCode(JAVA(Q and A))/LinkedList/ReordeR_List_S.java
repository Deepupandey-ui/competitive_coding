package LinkedList;
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
class ReorderR_List_S {
    public void reorderList(ListNode head) {
        ListNode middle = findMiddle(head);
        ListNode secondHalf = reverseList(middle.next);
        ListNode firstHalf = head;
         middle.next = null;
         while(secondHalf!=null){
            ListNode n1 =  firstHalf.next;
            ListNode n2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = n1;
            firstHalf = n1;
            secondHalf = n2;
         }
         
    }
    ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
   ListNode reverseList(ListNode head){
    ListNode curr = head;
    ListNode prev = null;
    while(curr!=null){
        ListNode nxt = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nxt;
    }
    return prev;
   } 
}
