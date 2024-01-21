/**
 * MoveRepeatWordEnd
 */
public class MoveRepeatWordEnd {
    public static String newStrings = "";

    public static void MoveEnd(String word,char x, int idx, int count){
        
        if(idx == word.length()){
            for(int i=0; i<count; i++){
                newStrings += 'x';
            }
            System.out.println(newStrings);
            return;
        }

        char curr = word.charAt(idx);

        if(x == curr){
            count++;
        }else{
            newStrings += curr;
        }

        MoveEnd(word, x, idx + 1, count);
    }

    public static void main(String[] args) {
        String word = "axcxnxox";

        MoveEnd(word, 'x', 0, 0);
    }
}