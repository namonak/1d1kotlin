package leetcode.problems.lv0easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

data class LongestCommonPrefixTestCase(val given: Array<String>, val want: String)

class TestLongestCommonPrefix {
    private val mLongestCommonPrefixTestCase = arrayOf(
        LongestCommonPrefixTestCase(arrayOf("flower", "flow", "flight"), "fl"),
        LongestCommonPrefixTestCase(arrayOf("dog", "racecar", "car"), ""),
    )

    @Test
    fun testLongestCommonPrefix() {
        val longestCommonPrefix = LongestCommonPrefix()

        for (testCase in mLongestCommonPrefixTestCase) {
            assertThat(longestCommonPrefix.longestCommonPrefix(testCase.given)).isEqualTo(testCase.want)
        }
    }
}
