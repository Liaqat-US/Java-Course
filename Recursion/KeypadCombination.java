/**
 * KeypadCombination
 */
public class KeypadCombination {

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void keypadcombination(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char curr = str.charAt(idx);
        String mapping = keypad[curr - '0'];

        for(int i=0; i<mapping.length(); i++){
            keypadcombination(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";

        keypadcombination(str, 0, "");
    }
}