/**
 * FabinaciNumber
 */
public class FabinaciNumber {

    public static void Fabinaci(int a, int b, int n) {
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        Fabinaci(b, c, n - 1);
    }

    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        Fabinaci(a, b, n);
    }
}