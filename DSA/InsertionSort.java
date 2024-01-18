package DSA;
/**
 * InsertionSort: in which we find smallest value and swap it.
 */
public class InsertionSort {

    //print Bubble Sorted Array
    public static void Display(int arr[]){
        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,1,4,2,8,3,7,5,6};

        for(int i=0; i<arr.length - 1; i++){
            int smallest = i;
            for(int j=i + 1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        Display(arr);
    }
}
