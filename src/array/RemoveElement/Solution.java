package array.RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = -1;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
