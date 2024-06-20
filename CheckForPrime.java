//{ Driver Code Starts
import java.io.*;

class CheckForPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            String res = obj.isPrime(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String isPrime(int n) {
        // code here
        boolean flag = false;
        if(n == 1){
            flag = true;
        }
        else if(n == 2){
            flag = false;
        }
        else if(n%2 == 0){
            flag = true;
        }
        else{
            for(int i = 3; i*i<=n; i += 2){
                if(n%i == 0){
                    flag = true;
                    break;
                }
            }
        }
        if(flag){
            return "No";
        }
        else{
            return "Yes";
        }
    }
}
        
