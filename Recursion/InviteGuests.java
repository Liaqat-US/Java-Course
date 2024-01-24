/**
 * InviteGuests
 */
public class InviteGuests {

    public static int inviteGuests(int n){
        if (n <= 1 ) {
            return 1;
        }

        //single way
        int single = inviteGuests(n - 1);

        //pair ways
        int pairs = (n-1) * inviteGuests(n-2);

        return single + pairs;
    }

    public static void main(String[] args) {
        int n = 4;

        int x = inviteGuests(n);

        System.out.println(x);
    }
}