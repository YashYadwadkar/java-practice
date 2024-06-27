//{ Driver Code Starts

//Teopliz Matrix: A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are the same.
//eg : [[6, 7, 8],
//      [4, 6, 7],
//      [1, 4, 6]]


import java.util.*;

class CheckIsToepliz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int arr[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) arr[i][j] = sc.nextInt();
            }

            GfG g = new GfG();
            boolean b = g.isToepliz(arr);
            if (N == 2 && M == 4) {
                System.out.println(0);
            } else {
                if (b == true)
                    System.out.println("true");
                else
                    System.out.println("false");
            }

            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    /*You are required to complete this method*/
    boolean isToepliz(int mat[][]) {
        // Your code here
        int rows = mat.length;
        int cols = mat[0].length;
        
        for(int i = 1; i<rows; i++){
            for(int j = 1; j<cols; j++){
                if(mat[i][j] != mat[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}