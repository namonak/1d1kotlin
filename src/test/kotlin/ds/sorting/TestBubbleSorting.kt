package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestBubbleSorting {
    @Test
    fun testSort() {
        // given
        val given = arrayOf(9, 3, 5, 7, 1)

        // when
        val actual = BubbleSorting().sort(given)

        // then
        assertThat(actual).isEqualTo(arrayOf(1, 3, 5, 7, 9))
    }
}
