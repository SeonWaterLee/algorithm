package leetcode;

/**
 * 比特位计数
 * 位运算
 * https://leetcode-cn.com/problems/counting-bits/
 *
 * @author vovoyager
 * @date 2021-03-03 17:18
 */
public class Q338 {

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        int high = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & (i - 1)) == 0) {
                high = i;
            }

            result[i] = result[i - high] + 1;
        }

        return result;
    }
}
