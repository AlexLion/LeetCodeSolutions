package array.RotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
        int prev, cur;
        for(int i = 0; i < k; i++){
            prev = nums[nums.length - 1];
            for(int j = 0; j < nums.length; j++){
                cur = nums[j];
                nums[j] = prev;
                prev = cur;
            }
        }
    }
}
