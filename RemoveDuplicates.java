import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int i=0, j=1;
        for (j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;

    }
}