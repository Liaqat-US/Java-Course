import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //String Declaration:
        // String name = new String("Liaqat");

        Scanner sc = new Scanner(System.in);

        // System.out.print("What's Your Name: ");
        // String name = sc.nextLine();
        // System.out.println("My Name Is : "+name);

        //finding length of string:
        // int lng = name.length();
        // System.out.println(lng);

        //printing single char of string:
        // String Full_Name = "Liaqat Ali";
        // for(int i=0; i<Full_Name.length(); i++){
        //     System.out.println(Full_Name.charAt(i));
        // }

        //Comparing Two Strings
        // String name = "liaqat";
        // String fname = "liaquat";

        // if(name.compareTo(fname) == 0){ 
        //     System.out.println("Strings Are Equal!");
        // }else{
        //     System.out.println("Strings Are Not Equal!");
        // }

        //finding a particular word/string/char:
        String sentence = "How Are You?";
        // substring(start_index, end_index)
        String particularWord = sentence.substring(8, sentence.length());

        System.out.println(particularWord);
    }
}
