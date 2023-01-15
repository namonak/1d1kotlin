package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class QuickSelectTestCase(val given: IntArray, val want: Int)

class TestQuickSelect {
    private val mQuickSelectTestCase = arrayOf(
        QuickSelectTestCase(
            intArrayOf(3, 5, 9, 1, 2, 4, 7),
            5
        )
    )

    @Test
    fun testSort() {
        val quickSelect = QuickSelect()

        mQuickSelectTestCase.forEach {
            val result = quickSelect.select(it.given, 6)

            assertThat(it.want).isEqualTo(result)
        }
    }
}