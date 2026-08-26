package Arrays.Leetcode;

import java.util.Arrays;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for(int i=nums.length; i>0; i--){
            if(nums[i] != nums[i - 1]){
                count ++;
            }
            if(count==3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}

