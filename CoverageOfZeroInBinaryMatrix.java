//{ Driver Code Starts
// Initial Template for Java
// Coverage of zero is the total number of ones around zero in up down left right 
import java.io.*;
import java.lang.*;

class CoverageOfZeroInBinaryMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.FindCoverage(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int FindCoverage(int[][] matrix) {
        int count = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                
                if (j > 0) {
                    if (matrix[i][j] == 0 && matrix[i][j - 1] == 1) {
                        count++;
                    }
                }
                
                if (i < matrix.length - 1) {
                    if (matrix[i][j] == 0 && matrix[i + 1][j] == 1) {
                        count++;
                    }
                }
                
                if (j < matrix[0].length - 1) {
                    if (matrix[i][j] == 0 && matrix[i][j + 1] == 1) {
                        count++;
                    }
                }
                
                if (i > 0) {
                    if (matrix[i][j] == 0 && matrix[i - 1][j] == 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
