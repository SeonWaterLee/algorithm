package leetcode;

/**
 * 删除排序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 *
 * @author vovoyager
 * @date 2021-03-03 23:48
 */
public class Q26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }

        int index = 1;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                nums[index] = nums[i];
                temp = nums[i];
                index++;
            }

            if (index - 1 != i) {
                nums[i] = 0;
            }
        }

        return index;
    }
}