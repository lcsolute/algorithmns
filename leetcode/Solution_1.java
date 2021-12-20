import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(m.containsKey(nums[i])){
                return new int[]{m.get(nums[i]),i};
            } 
            m.put(target - nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Solution_1 s = new Solution_1();
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] ans = s.twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}