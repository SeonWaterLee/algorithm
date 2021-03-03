package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q832Test {

    Q832 q832 = new Q832();

    @Test
    void flipAndInvertImage() {
        int[][] intput = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] result = new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        assertArrayEquals(result, q832.flipAndInvertImage(intput));
    }
}