package leetcode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vovoyager
 * @date 2021-02-26 16:42
 * @see
 */
class Q1052Test {

    Q1052 q1052 = new Q1052();

    @org.junit.jupiter.api.Test
    void maxSatisfied() {
        assertEquals(16, q1052.maxSatisfied(new int[]{1, 0, 1, 2, 1, 1, 7, 5}, new int[]{0, 1, 0, 1, 0, 1, 0, 1}, 3));
    }
}