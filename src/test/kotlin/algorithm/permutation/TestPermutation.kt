package algorithm.permutation

import org.junit.Test
import kotlin.test.assertEquals

data class TestCase(val given: IntArray, val want: Array<IntArray>)

class TestPermutation {
    @Test
    fun testSolution() {
        val testCase = arrayOf(
            TestCase(
                    intArrayOf(1, 2, 3),
                    arrayOf(
                        intArrayOf(1, 2, 3),
                        intArrayOf(1, 3, 2),
                        intArrayOf(2, 1, 3),
                        intArrayOf(2, 3, 1),
                        intArrayOf(3, 1, 2),
                        intArrayOf(3, 2, 1)
                    )
            )
        )
        testCase.forEach {
            val permutation = Permutation()

            val got = permutation.permutation(it.given)

            for (i in got.indices) {
                for (j in got[i].indices) {
                    assertEquals(it.want[i][j], got[i][j])
                }
            }
        }
    }
}