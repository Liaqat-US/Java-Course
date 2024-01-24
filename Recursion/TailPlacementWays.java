/**
 * TailPlacementWays
 */
public class TailPlacementWays {

    public static int TailPlacement(int n, int m){
        if(n == m ){
            return 2;
        }

        if(n < m){
            return 1;
        }

        //Horizontal
        int horizontalWay = TailPlacement(n-m, m);

        //Vertical
        int verticalWay = TailPlacement(n-1, m);

        return horizontalWay + verticalWay;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 3;

        int x = TailPlacement(n, m);

        System.out.println(x);
    }
}