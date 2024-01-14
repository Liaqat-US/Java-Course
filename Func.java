public class Func {

    //sum of two number with help of funciton
    static void Sum(int a, int b){
        System.out.println("Sum : "+(a+b));
    }

    //factorial of Number.
    static int Factorial(int x) {
        if(x == 0){
            return 1;
        }

        return x * Factorial(x - 1);
    }
    public static void main(String[] args) {
        Sum(12, 33);

        int y = Factorial(3);
        System.out.println("Factorial of Number: "+y);
    }
}
