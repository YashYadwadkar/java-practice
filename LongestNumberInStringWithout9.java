//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class LongestNumberInStringWithout9 {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        long maxNumber = -1;
        long number = 0;
        boolean isNumber = false;
        long sentenceLen = sentence.length();
        
        for (int i = 0; i < sentenceLen; i++) {
            char c = sentence.charAt(i);
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
                isNumber = true;
            } else {
                if (isNumber) {
                    if (!containsNumberNine(number)) {
                        if (number > maxNumber) {
                            maxNumber = number;
                        }
                    }
                    number = 0;
                    isNumber = false;
                }
            }
        }
        
        if (isNumber && !containsNumberNine(number)) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        
        return maxNumber;
    }

    boolean containsNumberNine(long n) {
        while (n > 0) {
            if (n % 10 == 9) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}
