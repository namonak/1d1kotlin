package boj.problems.step6

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

internal class No1152Test {
    @DisplayName("단어의 개수 테스트")
    @ParameterizedTest
    @CsvSource(
        value = ["The Curious Case of Benjamin Button:6", "The first character is a blank:6", "The last character is a blank:6", "Mazatneunde Wae Teullyeoyo:3", "Teullinika Teullyeotzi:2"],
        delimiter = ':'
    )
    @Throws(
        IOException::class
    )
    fun test(given: String, expected: String?) {
        println("단어의 개수 : https://www.acmicpc.net/problem/1152")

        // given
        val br_given = BufferedReader(StringReader(given))

        // when
        val actual: String = java.lang.String.valueOf(No1152.solve(br_given))

        // then
        Assertions.assertEquals(expected, actual)
    }
}
