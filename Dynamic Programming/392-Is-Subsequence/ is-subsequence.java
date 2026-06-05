// Two Pointers Solution(O(n) time complexity and O(1) space complexity)

// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int i=0,j=0;
//         while(i<s.length()&&j<t.length()){
//             if(s.charAt(i)==t.charAt(j)){
//                 i++;
//             }
//             j++;
//         }
//         return i==s.length();
//     }
// }

// Dynamic Programming Solution(O(n*m) time complexity and O(n*m) space complexity)

class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        boolean[][] dp = new boolean[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0] = false;
        }
        for(int j=0;j<=n;j++){
            dp[0][j] = true;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }
}