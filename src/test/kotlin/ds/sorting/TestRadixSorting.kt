package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class RadixSortingTestCase(val given: IntArray, val want: IntArray)

class TestRadixSorting {
    private val mRadixSortingTestCase = arrayOf(
        RadixSortingTestCase(
            intArrayOf(391, 582, 50, 924, 134, 8, 192),
            intArrayOf(8, 50, 134, 192, 391, 582, 924)
        )
    )

    @Test
    fun testSort() {
        val radixSorting = RadixSorting()

        mRadixSortingTestCase.forEach {
            val result = radixSorting.sort(it.given)

            for (i in it.want.indices) {
                assertThat(it.want[i]).isEqualTo(result[i])
            }
        }
    }
}
