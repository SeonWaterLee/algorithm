package leetcode;

/**
 * 1052. 爱生气的书店老板
 * 数组、 滑动窗口
 * https://leetcode-cn.com/problems/grumpy-bookstore-owner/
 * @author vovoyager
 * @date 2021-02-26 16:36
 */
public class Q1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int x) {
        int base = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                base += customers[i];
            }
        }

        int increase = 0;
        for (int i = 0; i < x; i++) {
            increase += customers[i] * grumpy[i];
        }

        int maxIncrease = increase;
        for (int i = x; i < customers.length; i++) {
            increase = increase + customers[i] * grumpy[i] - customers[i - x] * grumpy[i - x];
            maxIncrease =Math.max(maxIncrease, increase);
        }

        return base + maxIncrease;
    }
}
