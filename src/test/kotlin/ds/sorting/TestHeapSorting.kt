package ds.sorting

import org.junit.Test
import kotlin.test.assertEquals

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
                assertEquals(it.want[i], result[i])
            }
        }
    }
}