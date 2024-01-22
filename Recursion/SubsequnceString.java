/**
 * SubsequnceString
 */
public class SubsequnceString {

    public static void SubSequnce(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char curr = str.charAt(idx);

        //to be
        SubSequnce(str, idx + 1, newString+curr);

        //not to be
        SubSequnce(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abcd";

        SubSequnce(str, 0, "");
    }
}