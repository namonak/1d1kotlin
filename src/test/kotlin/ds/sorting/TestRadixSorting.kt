package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestRadixSorting {
    @Test
    fun testSort() {
        // given
        val given = arrayOf(391, 582, 50, 924, 134, 8, 192)

        // when
        val actual = RadixSorting().sort(given)

        // then
        assertThat(actual).isEqualTo(arrayOf(8, 50, 134, 192, 391, 582, 924))
    }
}
