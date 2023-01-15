package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class CountingSortingTestCase(val given: IntArray, val want: IntArray)

class TestCountingSorting {
    private val mCountingSortingTestCase = arrayOf(
        CountingSortingTestCase(
            intArrayOf(3, 3, 2, 1, 2),
            intArrayOf(1, 2, 2, 3, 3)
        ),
        CountingSortingTestCase(
            intArrayOf(3, 4, 0, 1, 2),
            intArrayOf(0, 1, 2, 3, 4)
        )
    )

    @Test
    fun testSort() {
        val countingSorting = CountingSorting()

        mCountingSortingTestCase.forEach {
            val result = countingSorting.sort(it.given)

            for (i in it.want.indices) {
                assertThat(it.want[i]).isEqualTo(result[i])
            }
        }
    }
}
