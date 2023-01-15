package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class SelectionSortingTestCase(val given: IntArray, val want: IntArray)

class TestSelectionSorting {
    private val mTestSelectionSortingTestCase = arrayOf(
        SelectionSortingTestCase(
            intArrayOf(9, 3, 5, 7, 1),
            intArrayOf(1, 3, 5, 7, 9),
        )
    )

    @Test
    fun testSort() {
        val selectionSorting = SelectionSorting()

        mTestSelectionSortingTestCase.forEach {
            val result = selectionSorting.sort(it.given)

            for (i in it.want.indices) {
                assertThat(it.want[i]).isEqualTo(result[i])
            }
        }
    }
}
