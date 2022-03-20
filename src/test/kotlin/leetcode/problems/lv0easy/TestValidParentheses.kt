package leetcode.problems.lv0easy

import junit.framework.TestCase.assertTrue
import junit.framework.TestCase.assertFalse
import org.junit.Test

class TestValidParentheses {
    @Test
    fun isValid() {
        val validParentheses = ValidParentheses()

        assertTrue(validParentheses.isValid("()"))
        assertTrue(validParentheses.isValid("()[]{}"))
        assertTrue(validParentheses.isValid("[]"))
        assertTrue(validParentheses.isValid("{}"))
        assertTrue(validParentheses.isValid("{()}"))
        assertTrue(validParentheses.isValid("{([])}"))
        assertFalse(validParentheses.isValid("(]"))
        assertFalse(validParentheses.isValid("{{"))
        assertFalse(validParentheses.isValid("{)"))
        assertFalse(validParentheses.isValid(")"))
        assertFalse(validParentheses.isValid(")("))
    }
}