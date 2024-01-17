import java.util.Scanner;

public class BitMinupulation {
    public static void main(String[] args) {
        //Bit Munopulation: Get, Set, Update, Clear

        
        int n = 5;
        int opt = 1;
        int BitMask = n<<opt;

        //Bit Get Operation: read bit.

        //In which used & bitwise operator
        // if( (n & BitMask) == 0 ){
        //     System.out.println("Bit Is Zero");
        // }else{
        //     System.out.println("Bit Is One");
        // }

        //Bit Set: insert new bit.
        //In which used | bitwise operator
        //int SetValue = n | BitMask;

        //Bit Clear: delete bit.
        //In which used & with ~ bitwise operator
        // int TildOpt = ~(BitMask);
        // int ClearValue = n & TildOpt;

        // System.out.println(ClearValue);

        //Bit Update: if 1 change into 0 or 0 change into 1
        //In which Bit Set is used for 1 and Bit Clear for 0
        
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();


        if(op == 1){
            //Bit Set: 1.
            int SetValue = n | BitMask;
            System.out.println(SetValue);
        }else{
            //Bit Clear: 0.
            int TildOpt = ~(BitMask);
            int ClearValue = n & TildOpt;
            System.out.println(ClearValue);
        }
    }
}
