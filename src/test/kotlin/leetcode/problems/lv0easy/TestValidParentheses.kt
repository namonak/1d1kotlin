package leetcode.problems.lv0easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestValidParentheses {
    @Test
    fun isValid() {
        val validParentheses = ValidParentheses()

        assertThat(validParentheses.isValid("()")).isTrue
        assertThat(validParentheses.isValid("()[]{}")).isTrue
        assertThat(validParentheses.isValid("[]")).isTrue
        assertThat(validParentheses.isValid("{}")).isTrue
        assertThat(validParentheses.isValid("{()}")).isTrue
        assertThat(validParentheses.isValid("{([])}")).isTrue
        assertThat(validParentheses.isValid("(]")).isFalse
        assertThat(validParentheses.isValid("{{")).isFalse
        assertThat(validParentheses.isValid("{)")).isFalse
        assertThat(validParentheses.isValid(")")).isFalse
        assertThat(validParentheses.isValid(")(")).isFalse
    }
}