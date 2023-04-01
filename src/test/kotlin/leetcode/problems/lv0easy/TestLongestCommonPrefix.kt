package leetcode.problems.lv0easy

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class TestLongestCommonPrefix : StringSpec({
    "testLongestCommonPrefix" {
        val testCases = arrayOf(
            row(arrayOf("flower", "flow", "flight"), "fl"),
            row(arrayOf("dog", "racecar", "car"), ""),
        )

        testCases.forEach { (given, expected) ->
            val actual = LongestCommonPrefix().longestCommonPrefix(given)

            actual shouldBe expected
        }
    }
})
