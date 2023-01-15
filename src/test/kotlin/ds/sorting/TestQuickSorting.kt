package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class QuickSortingTestCase(val given: IntArray, val want: IntArray)

class TestQuickSorting {
    private val mQuickSortingTestCase = arrayOf(
        QuickSortingTestCase(
            intArrayOf(7, 3, 4, 2, 5, 1),
            intArrayOf(1, 2, 3, 4, 5, 7)
        )
    )

    @Test
    fun testSort() {
        val quickSorting = QuickSorting()

        mQuickSortingTestCase.forEach {
            val result = quickSorting.sort(it.given)

            for (i in it.want.indices) {
                assertThat(it.want[i]).isEqualTo(result[i])
            }
        }
    }
}