package leetcode.problems.lv0easy

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class TestRomanToInteger : StringSpec({
    "testRomanToInteger" {
        val testCases = arrayOf(
            row("I", 1),
            row("V", 5),
            row("X", 10),
            row("L", 50),
            row("C", 100),
            row("D", 500),
            row("M", 1000),
            row("IV", 4),
            row("IX", 9),
            row("XL", 40),
            row("XC", 90),
            row("CD", 400),
            row("CM", 900),
            row("III", 3),
            row("LVIII", 58),
            row("MCMXCIV", 1994),
            row("MMMCMXCIX", 3999),
        )

        val romanToInteger = RomanToInteger()

        testCases.forEach { (given, want) ->
            val actual = romanToInteger.romanToInt(given)

            actual shouldBe want
        }
    }
})
