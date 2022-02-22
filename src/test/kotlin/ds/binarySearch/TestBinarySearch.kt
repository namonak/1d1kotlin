package ds.binarySearch

import org.junit.Test
import kotlin.test.assertEquals

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
            assertEquals(it.want, binarySearch.binarySearch(it.nums, it.target))
        }
    }
}