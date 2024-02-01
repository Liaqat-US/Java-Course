
/**
 * Chalenge1
 */
public class Chalenge1 {

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

    //size of list
    public int getSize(){
        return size;
    }

    public void deleteFromEnd(int n) {
        if (Head == null) {
            return;
        }

        if (n == size) {
            Head = Head.next;
            return;
        }

        // size
        Node curr = Head;
        while (curr != null) {
            curr = curr.next;
        }

        int moveToIndex = size - n;
        Node prevNode = Head;
        int i = 1;
        while (i < moveToIndex) {
            prevNode = prevNode.next;
            i++;
        }

        prevNode.next = prevNode.next.next;
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

    public static void main(String[] args) {
        Chalenge1 ll = new Chalenge1();

        ll.insertFirst("a");
        ll.insertFirst("is");
        ll.insertFirst("it");
        ll.insertFirst("list");
        ll.printList();

        ll.deleteFromEnd(4);
        ll.printList();

        System.out.println(ll.getSize());
    }
}