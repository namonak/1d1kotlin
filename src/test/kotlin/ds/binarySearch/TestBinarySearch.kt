package ds.binarySearch

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class TestCase(val nums: IntArray, val target: Int, val want: Int)

class TestBinarySearch {
    @Test
    fun testBinarySearch() {
        val testCase = arrayOf(
            TestCase(
                intArrayOf(1, 3, 5, 7, 9, 10, 13, 15, 17),
                7,
                3
            ),
            TestCase(
                intArrayOf(1, 3, 5, 7, 9, 10, 13, 15, 17),
                11,
                -1
            ),
            TestCase(
                intArrayOf(1, 3, 5, 7, 9, 10, 13, 15, 17),
            13,
            6
            )
        )

        val binarySearch = BinarySearch()

        testCase.forEach {
            val actual = binarySearch.binarySearch(it.nums, it.target)

            assertThat(actual).isEqualTo(it.want)
        }
    }
}