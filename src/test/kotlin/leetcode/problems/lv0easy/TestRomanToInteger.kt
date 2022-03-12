package leetcode.problems.lv0easy

import org.junit.Test
import kotlin.test.assertEquals

data class RomanToIntegerTestCase(val given: String, val want: Int)

class TestRomanToInteger {
    private val mRomanToIntegerTestCase = arrayOf(
        RomanToIntegerTestCase("I", 1),
        RomanToIntegerTestCase("V", 5),
        RomanToIntegerTestCase("X", 10),
        RomanToIntegerTestCase("L", 50),
        RomanToIntegerTestCase("C", 100),
        RomanToIntegerTestCase("D", 500),
        RomanToIntegerTestCase("M", 1000),
        RomanToIntegerTestCase("IV", 4),
        RomanToIntegerTestCase("IX", 9),
        RomanToIntegerTestCase("XL", 40),
        RomanToIntegerTestCase("XC", 90),
        RomanToIntegerTestCase("CD", 400),
        RomanToIntegerTestCase("CM", 900),
        RomanToIntegerTestCase("III", 3),
        RomanToIntegerTestCase("LVIII", 58),
        RomanToIntegerTestCase("MCMXCIV", 1994),
        RomanToIntegerTestCase("MMMCMXCIX", 3999),
    )

    @Test
    fun testRomanToInteger() {
        val romanToInteger = RomanToInteger()

        mRomanToIntegerTestCase.forEach {
            val result = romanToInteger.romanToInt(it.given)

            assertEquals(it.want, result)
        }
    }
}