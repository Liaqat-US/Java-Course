/**
 * QuickSort
 */
public class QuickSort {

    // time-complexity: worst: O(n^2), average: O(nlogn)
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        
        return i;
    }

    public static void quickSort(int arr[], int low, int high){
        if (low > high) {
            return;
        }

        int pidx = partition(arr, low, high);

        quickSort(arr, low, pidx-1);
        quickSort(arr, pidx+1, high);
    }

    public static void main(String[] args) {
        int arr[] = {4,3,5,2,1};
        int n = arr.length;

        quickSort(arr, 0 , n-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}