package ds.sorting

import org.junit.Test
import kotlin.test.assertEquals

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

            assertEquals(it.want, result)
        }
    }
}