package leetcode.problems.lv0easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TestPalindromeNumber {
    @ParameterizedTest
    @CsvSource(
        "121, true",
        "1221, true",
        "123, false",
        "1234, false"
    )
    fun testPalindromeNumber(given: Int, want: Boolean) {
        // when
        val actual = PalindromeNumber().isPalindrome(given)

        // then
        assertThat(actual).isEqualTo(want)
    }
}
