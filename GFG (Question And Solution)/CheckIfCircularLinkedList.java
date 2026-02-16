// Structure of LinkedList

//import LinkedList.Node;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class CheckIfCircularLinkedList {
    boolean isCircular(Node head) {

        if (head == null) return true;   

        Node curr = head;

        while (curr.next != null && curr.next != head) {
            curr = curr.next;
        }

        return curr.next == head;
    }
}
