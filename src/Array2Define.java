public class Array2Define {
    public static void main(String[] args) {
        // define 2D array
        // must be [][], not size needed
        int[][] a1;
        int a2[][];
        int[] a3[];
        int[][] a4 = {};
        int[] a5[] = {};
        int a6[][] = {};
        int[][] a11 = {{1,2},{3,4}};
        
        // new literal: must define outer size.
        int[][] b1 = new int[3][3];
        int[][] b2 = new int[3][];
        int[][] b3 = new int[3][0];
        int[][] b4 = new int[0][];
        int[] b5[] = new int[3][];
        int b6[][] = new int[3][];
        

        //not compile
        // int a[3][3];
        // int a[3][];
        // int[3][3] a = {};
        // int[][] a = {1,2,3};
        // int[] a = {{1,2},{3,4}};
        
        // int[][] a = new int[][];
        // int[][] a = new int[][3];
        // int[3][3] a = new int[][];
        // int a = new int[3][4];
    }
    
}
