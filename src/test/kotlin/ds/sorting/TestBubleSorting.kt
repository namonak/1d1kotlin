package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

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
                assertThat(it.want[i]).isEqualTo(result[i])
            }
        }
    }
}