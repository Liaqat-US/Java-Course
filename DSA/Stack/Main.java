package Stack;
public class Main {
    static class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            next = null;
        }
    }

    static class Stack {
        static Node head;

        public boolean isEmpty(){
            return head == null;
        }

        public void push(int d) {
            Node newNode = new Node(d);

            if (head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (head == null) {
                return -1;
            }

            int top = head.data;
            head = head.next;

            return top;
        }

        public int peek() {
            if (head == null) {
                return -1;
            }

            return head.data;
        }
        
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

        // s.pop();

        // System.out.println(s.peek());
    }
}