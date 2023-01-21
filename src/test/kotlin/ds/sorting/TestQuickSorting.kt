package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestQuickSorting {
    @Test
    fun testSort() {
        // given
        val given = arrayOf(7, 3, 4, 2, 5, 1)

        // when
        val actual = QuickSorting().sort(given)

        // then
        assertThat(actual).isEqualTo(arrayOf(1, 2, 3, 4, 5, 7))
    }
}
