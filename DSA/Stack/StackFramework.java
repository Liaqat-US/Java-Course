import java.util.Stack;

public class StackFramework {
    
    public static int pushAtButtom (int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            return s.push(data);
        }

        int top = s.pop();
        pushAtButtom(data, s);

        return s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);

        pushAtButtom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        // pushAtButtom(5, s);
        reverseStack(s);

        // int x = s.size()-1;
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        // System.out.println(s.get(0));
    }
}
