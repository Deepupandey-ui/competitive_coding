class Node{
    int coeff;
    int pow;
    Node next;
    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}

// Print the polynomial formed by adding both LL in the function itself.
class PolynomialAddition {

    public static Node addPolynomial(Node p1, Node p2) {

        Node dummy = new Node(0, 0);
        Node curr = dummy;

        while (p1 != null && p2 != null) {

            if (p1.pow == p2.pow) {
                curr.next = new Node(p1.coeff + p2.coeff, p1.pow);
                p1 = p1.next;
                p2 = p2.next;
            }
            else if (p1.pow > p2.pow) {
                curr.next = new Node(p1.coeff, p1.pow);
                p1 = p1.next;
            }
            else {
                curr.next = new Node(p2.coeff, p2.pow);
                p2 = p2.next;
            }

            curr = curr.next;
        }
        while (p1 != null) {
            curr.next = new Node(p1.coeff, p1.pow);
            curr = curr.next;
            p1 = p1.next;
        }

        while (p2 != null) {
            curr.next = new Node(p2.coeff, p2.pow);
            curr = curr.next;
            p2 = p2.next;
        }

        return dummy.next;
    }
}
