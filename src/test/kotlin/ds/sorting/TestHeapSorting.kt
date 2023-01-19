package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestHeapSorting {
    @Test
    fun testSort() {
        // given
        val given = arrayOf(3, 5, 7, 9, 4, 2)

        // when
        val actual = HeapSorting().sort(given)

        // then
        assertThat(actual).isEqualTo(arrayOf(2, 3, 4, 5, 7, 9))
    }
}
