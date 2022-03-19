package leetcode.problems.lv0easy

import junit.framework.TestCase.assertEquals
import org.junit.Test

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
            assertEquals(testCase.want, longestCommonPrefix.longestCommonPrefix(testCase.given))
        }
    }
}