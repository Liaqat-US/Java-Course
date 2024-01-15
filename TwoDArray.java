class TwoDArray {
    public static void main(String[] args){
        //Declaration of 2-D Array:

        // int[][] arr = new int[2][2];

        // arr[0][0] = 11;

        int arr[][] = {{11,22},{33,44}};


        //printing:
        // System.out.println(arr[0][0]);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
