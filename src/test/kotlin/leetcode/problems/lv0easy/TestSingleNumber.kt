package leetcode.problems.lv0easy

import org.junit.Test

data class SingleNumberTestCase(val given: IntArray, val want: Int)
class TestSingleNumber {
    private val mSingleNumberTestCase = arrayOf(
        SingleNumberTestCase(
            given = intArrayOf(2, 2, 1),
            want = 1
        ),
        SingleNumberTestCase(
            given = intArrayOf(4, 1, 2, 1, 2),
            want = 4
        ),
        SingleNumberTestCase(
            given = intArrayOf(1),
            want = 1
        )
    )

    @Test
    fun testSingleNumber() {
        val singleNumber = SingleNumber()

        for (testCase in mSingleNumberTestCase) {
            val got = singleNumber.singleNumber(testCase.given)
            assert(got == testCase.want)
        }
    }
}