import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        //Sum of two numbers.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.print("Sum of a and b: ");
        System.out.print(sum);
    }
}
