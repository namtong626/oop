package baicode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BaiMotTest {
    public static void main(String[] args) {
        int [] nums =  {2,11,15,7};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; //  map.get(complement) => tra ve 0; i hien tai = 1;
            }

            map.put(nums[i], i); // {2 => 0}
        }

        throw new IllegalArgumentException("not a number");
    }
}
