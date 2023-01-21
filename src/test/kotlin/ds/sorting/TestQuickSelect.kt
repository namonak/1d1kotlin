package ds.sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestQuickSelect {
    @Test
    fun testSort() {
        // given
        val given = arrayOf(3, 5, 9, 1, 2, 4, 7)

        // when
        val actual = QuickSelect().select(given, 6)

        // then
        assertThat(actual).isEqualTo(9)
    }
}
