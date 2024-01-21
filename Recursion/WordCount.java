/**
 * WordCount
 */
public class WordCount {

    public static int First = -1;
    public static int Last = -1;

    public static void WordComes(String word, char x, int idx){
        if(word.length() == idx){
            System.out.println("First: "+First);
            System.out.println("Last: "+Last);
            return;
        }

        char curr = word.charAt(idx);

        if(curr == x){
            if(First == -1){
                First = idx;
            }else{
                Last = idx;
            }
        }

        WordComes(word, x, idx + 1);

    }

    public static void main(String[] args) {
        String word = "adcadaia";

        WordComes(word, 'a', 0);
    }
}