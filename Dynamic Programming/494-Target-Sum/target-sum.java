// Time Complexity: O(2^n)
// Space Complexity: O(n)

// class Solution {
//     public int findTargetSumWays(int[] nums, int target) {
//         return dfs(nums, 0, 0, target);
//     }
//     private int dfs(int[] nums,int index,int sum,int target) {
//         if (index == nums.length) {
//             return sum == target ? 1 : 0;
//         }
//         int plus = dfs( nums, index + 1, sum + nums[index], target);
//         int minus = dfs(nums,index + 1,sum - nums[index],target);
//         return plus + minus;
//     }
// }

// Time Complexity: O(n * sum)
// Space Complexity: O(sum)

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        if (total < Math.abs(target) || (total + target) % 2 != 0) {
            return 0;
        }
        int newTarget = (total + target) / 2;
        int[] dp = new int[newTarget + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = newTarget; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }
        return dp[newTarget];
    }
}