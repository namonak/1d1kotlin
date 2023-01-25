package leetcode.problems.lv0easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TestLongestCommonPrefix {
    @ParameterizedTest
    @CsvSource(value = ["flower,flow,flight:fl", "dog,racecar,car:''"], delimiter = ':')

    fun testLongestCommonPrefix(given: String, want: String) {
        // given
        val str = given.split(",").toTypedArray()

        // when
        val actual = LongestCommonPrefix().longestCommonPrefix(str)

        // then
        assertThat(actual).isEqualTo(want)
    }
}
