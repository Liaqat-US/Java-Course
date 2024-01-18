package DSA;

/**
 * BubbleSort: in which we find greatest value and swap it.
 */


public class BubbleSort {

    //print Bubble Sorted Array
    public static void Display(int arr[]){
        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,9,4,2,8,3,7,5,6};

        for(int i=0; i<arr.length - 1; i++){
            for(int j=0; j<arr.length - i - 1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        Display(arr);
    }
}