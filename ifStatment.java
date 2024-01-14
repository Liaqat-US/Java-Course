import java.util.Scanner;

class ifStatment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("You are Younger.");
        }else {
            System.out.println("You are Teenager");
        }
    }
}