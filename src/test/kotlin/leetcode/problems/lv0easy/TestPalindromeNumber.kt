package leetcode.problems.lv0easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class PalindromeNumberTestCase(val given: Int, val wanted: Boolean)
class TestPalindromeNumber {
    private val mPalindromeNumberTestCase = arrayOf(
        PalindromeNumberTestCase(121, true),
        PalindromeNumberTestCase(1221, true),
        PalindromeNumberTestCase(123, false),
        PalindromeNumberTestCase(1234, false)
    )

    @Test
    fun testPalindromeNumber() {
        val palindromeNumber = PalindromeNumber()

        for (testCase in mPalindromeNumberTestCase) {
            val got = palindromeNumber.isPalindrome(testCase.given)
            assertThat(got).isEqualTo(testCase.wanted)
        }
    }
}