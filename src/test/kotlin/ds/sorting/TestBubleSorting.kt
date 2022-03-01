package ds.sorting

import org.junit.Test
import kotlin.test.assertEquals

data class BubbleSortingTestCase(val given: IntArray, val want: IntArray)

class TestBubbleSorting {
    private val mTestBubbleSorting = arrayOf(
        BubbleSortingTestCase(
            intArrayOf(9, 3, 5, 7, 1),
            intArrayOf(1, 3, 5, 7, 9)
        )
    )

    @Test
    fun testSort() {
        val bubbleSorting = BubbleSorting()

        mTestBubbleSorting.forEach {
            val result = bubbleSorting.sort(it.given)

            for (i in it.want.indices) {
                assertEquals(it.want[i], result[i])
            }
        }
    }
}