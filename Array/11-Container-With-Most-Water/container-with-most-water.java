// import java.util.Scanner;
// public class Solution {
//     public int maxArea(int[] height) {
//         int i = 0;
//         int j = height.length - 1;
//         int max = 0;
//         while (i < j) {
//             int h = Math.min(height[i], height[j]);
//             int w = j - i;
//             int area = h * w;

//             max = Math.max(max, area);
            
//             // Move the pointer that points to the shorter line
//             if (height[i] < height[j]) {
//                 i++;
//             } else {
//                 j--;
//             }
//         }
//         return max;
//     }

//     // Main method to test your solution locally in VS Code
//     public static void main(String[] args) {
//         Solution solver = new Solution();

//         // Test Case 1: Standard LeetCode Example
//         int[] test1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//         System.out.println("Test Case 1 Output: " + solver.maxArea(test1)); // Expected: 49

//         // Test Case 2: Minimal elements
//         int[] test2 = {1, 1};
//         System.out.println("Test Case 2 Output: " + solver.maxArea(test2)); // Expected: 1
//     }
// }
class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,max=0;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int w=j-i;
            int area=h*w;

            max=Math.max(max,area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;

    }
}