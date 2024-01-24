/**
 * TotalPaths
 */
public class TotalPaths {

    public static int Totolpahts(int i, int j, int m, int n){
        if(i == n || j == n){
            return 0;
        }
        if (i == n-1 && j == n-1) {
            return 1;
        }

        int DownPaths = Totolpahts(i+1,j,m,n);
        int RightPaths = Totolpahts(i,j+1,m,n);

        return DownPaths + RightPaths;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;

       int paths = Totolpahts(0, 0, m, n);

       System.out.println(paths);
    }
}