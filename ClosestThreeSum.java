//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class ClosestThreeSum {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());

            out.println(new Solution().threeSumClosest(arr, key));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int threeSumClosest(int[] array, int target) {
        // code here
        Arrays.sort(array);
        int closestSum = array[0] + array[1] + array[2];
        
        for (int i = 0; i <= array.length - 3; i++) {
            int j = i + 1;
            int k = array.length - 1;
            
            while (j < k) {
                int sum = array[i] + array[j] + array[k];
                
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
                
                 if (Math.abs(sum - target) < Math.abs(closestSum - target) ||
                    (Math.abs(sum - target) == Math.abs(closestSum - target) && sum > closestSum)) {
                    closestSum = sum;
                }
            }
        }
        
        return closestSum;
    }
}

