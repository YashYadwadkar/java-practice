
import java.io.*;

class CompareStringFraction {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String compareFrac(String str) {
        // Code here
        String[] snum = str.split(", ");
        String[] num1 = snum[0].split("/");
        String[] num2 = snum[1].split("/");
        double ntr1 = Integer.parseInt(num1[0]);
        double dtr1 = Integer.parseInt(num1[1]);
        double ntr2 = Integer.parseInt(num2[0]);
        double dtr2 = Integer.parseInt(num2[1]);
        
        double frac1 = ntr1/dtr1;
        double frac2 = ntr2/dtr2;
        
        if(frac1 > frac2){
            return snum[0];
        }
        else if(frac1 < frac2){
            return snum[1];
        }
        else{
            return "equal";
        }
        
    }
}
