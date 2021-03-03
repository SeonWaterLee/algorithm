package leetcode;

/**
 * 翻转图像
 * 数组
 * https://leetcode-cn.com/problems/flipping-an-image/
 *
 * @author vovoyager
 * @date 2021-02-26 17:18
 */
public class Q832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = n; j > 0; j--) {
                result[i][n - j] = A[i][j - 1] == 0 ? 1 : 0;
            }
        }

        return result;
    }
}
