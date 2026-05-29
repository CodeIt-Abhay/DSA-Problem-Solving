// Brute Force Solution

// class Solution {
//     public int fib(int n) {
//         if(n<=1)return n;{return fib(n-1) + fib(n-2);}  
//     }
// }

// Optimized Tabulation(Bottom-Up)

// class Solution {
//     public int fib(int n) {
//         if (n <= 1) return n;    
//         int prev2 = 0;
//         int prev1 = 1; 
//         int current = 0;     
//         for (int i = 2; i <= n; i++) {
//             current = prev1 + prev2;
//             prev2 = prev1;
//             prev1 = current;
//         }   
//         return current;
//     }
// }

// Memoization(Top-Down)

class Solution {
    public int fib(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }
    private int helper(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
        return memo[n];
    }
}