class Array {
    public static void main(String[] args) {
        //Declaration:
        // int[] arr = new int[5];
        
        //First Method of Array Declaration.
        // arr[0] = 11;
        // arr[1] = 22;
        // arr[2] = 33;
        // arr[3] = 44;
        // arr[4] = 55;

        //Second Method of Array Declaration.
        int arr[] = {11,22,33,44,55};

        //printing Array
        // System.out.println(arr[0]);

        //printing array with help of loop
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}