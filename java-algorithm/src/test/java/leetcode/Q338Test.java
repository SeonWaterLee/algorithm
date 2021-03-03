package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vovoyager
 * @date 2021-03-03 20:16
 */
class Q338Test {

    Q338 q338 = new Q338();

    @Test
    void countBits() {
        int[] result5 = q338.countBits(5);
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, result5);

        int[] result8 = q338.countBits(8);
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1}, result8);
    }
}