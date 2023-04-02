package leetcode.problems.lv0easy

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class TestPalindromeNumber : StringSpec({
    "testPalindromeNumber" {
        val testCases = listOf(
            row(121, true),
            row(1221, true),
            row(123, false),
            row(1234, false),
        )

        testCases.forEach { (given, expected) ->
            val actual = PalindromeNumber().isPalindrome(given)

            actual shouldBe expected
        }
    }
})
