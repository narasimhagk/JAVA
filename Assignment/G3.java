//{ Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.revStr(S));
        }
    }
}
// } Driver Code Ends


class Solution {
    static String revStr(String S) {
        // store the resulting string in final_S
        String final_S = new String();
        // go through whole string
        for (int i = S.length() - 1; i >= 0; i--) {
            // take S[i] for only odd position
            final_S += S.charAt(i);
        }
        // final resulting string
        return final_S;
    }
} 