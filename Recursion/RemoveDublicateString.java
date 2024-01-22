/**
 * RemoveDublicateString
 */
public class RemoveDublicateString {
    public static boolean[] map = new  boolean[26];

    public static void RemoveDoublicateChar(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char curr = str.charAt(idx);

        if(map[curr - 'a']){
            RemoveDoublicateChar(str, idx + 1, newString);
        }else{
            newString += curr;
            map[curr - 'a'] = true;
            RemoveDoublicateChar(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String word = "abbccdda";

        RemoveDoublicateChar(word, 0, "");
    }
}