/**
 * StringsReverse
 */
public class StringsReverse {

    public static void WordReverse(String str, int strLength) {
        if(strLength == 0) {
            System.out.print(str.charAt(strLength));
            return;
        }

        System.out.print(str.charAt(strLength));
        WordReverse(str, strLength - 1);
    }

    public static void main(String[] args) {
        String alphabets  = "abcd";
        int leng = alphabets.length();

        System.out.println(alphabets);

        WordReverse(alphabets, leng - 1);
    }
}