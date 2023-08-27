package org.zealot.algorithm.scratchpad.one;

import org.junit.jupiter.api.Test;
import org.zealot.algorithm.scratchpad.one.BacktrackFindCombinationSum;

import java.util.Arrays;

public class BacktrackFindCombinationSumTest {
    @Test
    void combinationSum() {
        int[] num = new int[]{2, 3, 6, 7};
        int target = 7;
        System.out.println(String.format("Input=%s, target=%d, result=%s", Arrays.toString(num),
                target, BacktrackFindCombinationSum.findTargetSum(num, target)));

        num = new int[]{2, 4, 6, 8};
        target = 10;
        System.out.println(String.format("Input=%s, target=%d, result=%s", Arrays.toString(num),
                target, BacktrackFindCombinationSum.findTargetSum(num, target)));
    }
}
