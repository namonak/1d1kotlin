package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class HeapSortingTestCase(val given: IntArray, val want: IntArray)

class TestHeapSorting {
    private val mHeapSortingTestCase = arrayOf(
        HeapSortingTestCase(
            intArrayOf(3, 5, 7, 9, 4, 2),
            intArrayOf(2, 3, 4, 5, 7, 9)
        )
    )

    @Test
    fun testSort() {
        val heapSorting = HeapSorting()

        mHeapSortingTestCase.forEach {
            val result = heapSorting.sort(it.given)

            for (i in it.want.indices) {
                assertThat(it.want[i]).isEqualTo(result[i])
            }
        }
    }
}