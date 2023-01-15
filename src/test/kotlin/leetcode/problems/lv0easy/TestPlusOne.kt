package leetcode.problems.lv0easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class PlusOneTestCase(val given: IntArray, val want: IntArray)

class TestPlusOne {
    private val mTestCase = arrayOf(
        PlusOneTestCase(intArrayOf(1, 2, 3), intArrayOf(1, 2, 4)),
        PlusOneTestCase(intArrayOf(4, 3, 2, 1), intArrayOf(4, 3, 2, 2)),
        PlusOneTestCase(intArrayOf(9), intArrayOf(1, 0)),
        PlusOneTestCase(intArrayOf(9, 9), intArrayOf(1, 0, 0)),
        PlusOneTestCase(intArrayOf(9, 9, 9), intArrayOf(1, 0, 0, 0))
    )

    @Test
    fun testPlusOne() {
        val plusOne = PlusOne()

        for (testCase in mTestCase) {
            val got = plusOne.plusOne(testCase.given)
            assertThat(got).isEqualTo(testCase.want)
        }
    }
}
