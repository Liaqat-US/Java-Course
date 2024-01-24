import java.util.ArrayList;

/**
 * SubSets
 */
public class SubSets {

    //print subsets
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=-0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    //find subset of number
    public static void Subset(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }

        //want to add
        subset.add(n);
        Subset(n - 1, subset);

        //not want to add
        subset.remove(subset.size()-1);
        Subset(n - 1, subset);

    }

    public static void main(String[] args) {
        int n = 3;

        ArrayList<Integer> subset = new ArrayList<>();

        Subset(n, subset);
    }
}