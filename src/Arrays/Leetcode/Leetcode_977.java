package Arrays.Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_977 {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            for(int i = 0; i<nums.length; i++){
                nums[i]=nums[i]*nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }
}
