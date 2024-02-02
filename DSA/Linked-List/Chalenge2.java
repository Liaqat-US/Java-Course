public class Chalenge2 {
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

    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node findMiddle() {
        Node here = Head;
        Node turtle = Head;

        while (here.next !=null && here.next.next !=null) {
            here = here.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrone(){
        if(Head == null && Head.next ==null) {
            return true;
        }

        Node middle = findMiddle();
        Node secondHalfStart = reverse(middle.next);
        Node firstHalfStart = Head;

        while (secondHalfStart != null) {
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
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
        Chalenge2 ll = new Chalenge2();

        ll.insertFirst("1");
        ll.insertFirst("2");
        ll.insertFirst("2");
        ll.insertFirst("1");
        ll.printList();

        System.out.println(ll.isPalindrone());
    }

}