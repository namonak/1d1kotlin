package leetcode.problems.lv0easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class TestData(val given1: IntArray, val given2: Int, val want: IntArray)

class TestTwoSum {
    private val mTestData = arrayOf(
        TestData(
            given1 = intArrayOf(2, 7, 11, 15),
            given2 = 9,
            want = intArrayOf(0, 1)
        ),
        TestData(
            given1 = intArrayOf(3, 2, 4),
            given2 = 6,
            want = intArrayOf(1, 2)
        ),
        TestData(
            given1 = intArrayOf(3, 3),
            given2 = 6,
            want = intArrayOf(0, 1)
        ),
        TestData(
            given1 = intArrayOf(0, 4, 3, 0),
            given2 = 0,
            want = intArrayOf(0, 3)
        ),
        TestData(
            given1 = intArrayOf(-3, 4, 3, 90),
            given2 = 0,
            want = intArrayOf(0, 2)
        ),

        TestData(
            given1 = intArrayOf(-1, -2, -3, -4, -5),
            given2 = -8,
            want = intArrayOf(2, 4)
        ),
    )

    @Test
    fun testTwoSum() {
        val twoSum = TwoSum()

        for (testData in mTestData) {
            val got = twoSum.twoSum(testData.given1, testData.given2)
            assertThat(got).isEqualTo(testData.want)
        }
    }
}
