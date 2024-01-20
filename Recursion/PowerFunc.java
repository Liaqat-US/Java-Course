/**
 * PowerFunc
 */
public class PowerFunc {

    public static int PowerNumber(int a, int n) {
        
        if(n == 0){
            return 1;
        }

        if(a == 0){
            return 0;
        }

        int aPwrN = PowerNumber(a, n - 1);
        int aPwr = a * aPwrN;
        return aPwr;
    }

    public static void main(String[] args) {
        int n = 3;
        int a = 3;

       int x = PowerNumber(a, n);
       System.out.println(x);
    }
}