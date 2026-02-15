package LinkedList;

class ListNode {
    ListNode next;
    int val;

    public ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class RemoveCycle {

    public ListNode removeCycleListNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return head;
        }

        // Step 2: Find start of cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Find last node of cycle
        ListNode ptr = slow;
        while (ptr.next != slow) {   
            ptr = ptr.next;
        }

        // Step 4: Break the cycle
        ptr.next = null;

        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        System.out.println("Cycle created!");

        // Create object to call method
        RemoveCycle obj = new RemoveCycle();
        head = obj.removeCycleListNode(head);

        System.out.println("Cycle removed. Linked List is:");
        printList(head);
    }
}
