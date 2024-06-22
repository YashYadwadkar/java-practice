//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class PrintBracketNumberFromStr {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            ArrayList<Integer> result = ob.bracketNumbers(S);
            for (int value : result) out.print(value + " ");
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> fin = new ArrayList<>();
        int c = 1;
        
        for(char ch : str.toCharArray()){
            if(ch == '('){
                s.push(c);
                fin.add(c);
                c++;
            }else if(ch == ')'){
                fin.add(s.pop());
            }
        }
        return fin;
    }
};