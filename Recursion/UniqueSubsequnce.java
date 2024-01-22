import java.util.HashSet;

/**
 * UniqueSubsequnce
 */
public class UniqueSubsequnce {

    public static void SubSequnce(String str, int idx, String newString, HashSet<String> set ){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char curr = str.charAt(idx);

        //to be
        SubSequnce(str, idx + 1, newString+curr, set);

        //not to be
        SubSequnce(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "ab";

        HashSet<String> set = new HashSet<>();

        SubSequnce(str, 0, "", set);
    }
}