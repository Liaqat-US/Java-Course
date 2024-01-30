/**
 * LinkedList
 */
public class LinkedList {
    Node Head;
    private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            next = null;
            size++;
        }
    }

    //insert an element at first
    public void insertFirst(String data) {
        Node newNode = new Node(data);

        if(Head == null){
            Head = newNode;
            return;
        }

        newNode.next = Head;
        Head = newNode;
    }

    //insert an element at end
    public void insertEnd(String data) {
        Node newNode = new Node(data);

        if(Head == null){
            Head = newNode;
            return;
        }

        Node currNode = Head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //print list
    public void printList(){
        if (Head == null) {
            System.out.println("Linked-List is empty.");
            return;
        }

        Node newNode = Head;
        while(newNode != null){
            System.out.print(newNode.data+"->");
            newNode = newNode.next;
        }
        System.out.println("null");
    }

    //delete first
    public void deleteFirst(){
        if(Head == null) {
            System.out.println("Linked-List is empty.");
            return;
        }

        size--;
        Head = Head.next;
        // Head.next = null;
    }

    //delete last
    public void deleteLast(){
        if (Head == null) {
            System.out.println("Linked-List is empty.");
            return;
        }

        size--;
        //for one element in list
        if(Head.next == null){
            Head = null;
            return;
        }

        Node secondLast = Head;
        Node Last = Head.next;

        while (Last.next != null) {
            Last = Last.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }


    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertFirst("a");
        ll.insertFirst("is");
        ll.insertFirst("it");
        ll.printList();

        ll.insertEnd("list");
        ll.printList();

        ll.deleteFirst();
        // ll.deleteFirst();
        ll.printList();

        ll.deleteLast();
        // ll.deleteLast();
        ll.printList();

        System.out.println(ll.getSize());
    }
}