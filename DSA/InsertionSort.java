package DSA;
/**
 * InsertionSort: in which we divide array into two parts i.e one is sorted part 
 * and another is unsorted part.
 */
public class InsertionSort {

    //print Sorted Array
    public static void Display(int arr[]){
        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,1,4,2,8,3,7,5,6};

        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int j = i - 1;

            while (j>=0 && curr > arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            //correct placement
            arr[j+1] = curr;
        }

        Display(arr);
    }
}
