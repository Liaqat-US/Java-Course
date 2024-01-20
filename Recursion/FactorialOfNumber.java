/**
 * FactorialOfNumber
 */
public class FactorialOfNumber {

    public static int FactorialNumber(int n) {
        
        if(n == 0){
            return 1;
        }

        int facN = FactorialNumber(n - 1);
        int FacNumber = n * facN;
        return FacNumber;
    }

    public static void main(String[] args) {
        int n = 5;

       int x = FactorialNumber(n);
       System.out.println(x);
    }
}
