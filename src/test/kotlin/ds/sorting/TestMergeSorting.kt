package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class MergeSortingTestCase(val given: IntArray, val want: IntArray)

class TestMergeSorting {
    private val mMergeSortingTestCase = arrayOf(
        MergeSortingTestCase(
            intArrayOf(9, 3, 5, 7, 1),
            intArrayOf(1, 3, 5, 7, 9),
        )
    )

    @Test
    fun testSort() {
        val mergeSorting = MergeSorting()

        mMergeSortingTestCase.forEach {
            val result = mergeSorting.sort(it.given)

            for (i in it.want.indices) {
                assertThat(it.want[i]).isEqualTo(result[i])
            }
        }
    }
}
