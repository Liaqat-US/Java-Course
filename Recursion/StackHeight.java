/**
 * StackHeight
 */
public class StackHeight {

    public static int StackHeight(int x, int n) {
        
        if(n == 0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        if(n%2 == 0){//n is even
            return StackHeight(x, n/2) * StackHeight(x, n/2);
        }else{//n is odd
            return StackHeight(x, n/2) * StackHeight(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int a = 3;

       int x = StackHeight(a, n);
       System.out.println(x);
    }
}
