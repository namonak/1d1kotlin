package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class InsertionSortingTestCase(val given: IntArray, val want: IntArray)

class TestInsertionSorting {
    private val mTestInsertionSorting = arrayOf(
        InsertionSortingTestCase(
            intArrayOf(9, 3, 5, 7, 1),
            intArrayOf(1, 3, 5, 7, 9),
        )
    )

    @Test
    fun testSort() {
        val insertionSorting = InsertionSorting()

        mTestInsertionSorting.forEach {
            val result = insertionSorting.sort(it.given)

            for (i in it.want.indices) {
                assertThat(it.want[i]).isEqualTo(result[i])
            }
        }
    }
}