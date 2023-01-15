package ds.array.findPivotIndex

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class TestCase(val given: IntArray, val want: Int)

class TestPivotIndex {
    @Test
    fun testPivotIndex() {
        val testCase = arrayOf(
            TestCase(
                intArrayOf(1, 8, 2, 9, 2, 3, 6),
                3
            ),
            TestCase(
                intArrayOf(2, 5, 7),
                -1
            )
        )
        testCase.forEach {
            val pivotIndex = PivotIndex()

            val got = pivotIndex.pivotIndex(it.given)

            assertThat(it.want).isEqualTo(got)
        }
    }
}
