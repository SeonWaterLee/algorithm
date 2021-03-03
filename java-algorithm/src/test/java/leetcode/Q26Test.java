package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vovoyager
 * @date 2021-03-03 23:57
 */
class Q26Test {

    Q26 q26 = new Q26();

    @Test
    void removeDuplicates() {
        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, q26.removeDuplicates(input));
    }
}