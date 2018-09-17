package array.TwoSum.first;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        for(int i = 0; i < nums.length; i++){
            int elem1 = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                int elem2 = nums[j];
                if((elem1 + elem2) == target){
                    result = new int[]{i, j};
                    return result;
                }
            }
        }
        return result;
    }
}
