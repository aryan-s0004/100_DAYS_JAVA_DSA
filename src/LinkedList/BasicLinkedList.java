package LinkedList;

class SinglyLL {
    int data;
    SinglyLL next;

    // Constructor WITHOUT using 'this'
    SinglyLL(int value) {
        data = value;   // instance variable
        next = null;
    }
}

public class BasicLinkedList {
    public static void main(String[] args) {

        // Creating nodes
        SinglyLL node1 = new SinglyLL(1);
        SinglyLL node2 = new SinglyLL(2);
        SinglyLL node3 = new SinglyLL(3);

        // Linking nodes
        node1.next = node2;
        node2.next = node3;

        // Head points to first node
        SinglyLL head = node1;

        // Traversing the list
        SinglyLL temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
