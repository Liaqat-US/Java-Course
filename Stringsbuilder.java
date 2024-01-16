/**
 * Stringsbuilder
 */
public class Stringsbuilder {

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");

        //printing single char at specific index:
        // System.out.println(sb.charAt(0));

        //finding length of StringBuilder
        // System.out.println(sb.length());

        //used to replace char:
        // sb.setCharAt(0, 'b');

        //insert char at specific point:
        // sb.insert(2, 'p');

        //insert char at end of stringbuilder:
        // sb.append('o');

        // System.out.println(sb);


        //reverse stringbuilder:
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char front_char = sb.charAt(front);
            char back_char = sb.charAt(back);

            sb.setCharAt(front, back_char);
            sb.setCharAt(back, front_char);
        }

        System.out.println(sb);
    }
}