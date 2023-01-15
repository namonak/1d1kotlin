package ds.array.moveZeros

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class TestCase(val given: IntArray, val want: IntArray)

class TestMoveZeros {
    @Test
    fun testBinarySearch() {
        val testCase = arrayOf(
            TestCase(
                intArrayOf(0, 5, 0, 7, 6, 3),
                intArrayOf(5, 7, 6, 3, 0, 0)
            ),
            TestCase(
                intArrayOf(0, 0, 0, 0, 5, 9, 3),
                intArrayOf(5, 9, 3, 0, 0, 0, 0)
            ),
        )

        val moveZeros = MoveZeros()

        testCase.forEach {
            var result = moveZeros.MoveZeros(it.given)
            for (i in result.indices) {
                assertThat(it.want[i]).isEqualTo(result[i])
            }
        }
    }
}
