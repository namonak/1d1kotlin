package boj.problems.step6

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

internal class No11654Test {
    @DisplayName("아스키 코드 테스트")
    @ParameterizedTest
    @CsvSource(value = ["A:65", "C:67", "0:48", "9:57", "a:97", "z:122"], delimiter = ':')
    @Throws(
        IOException::class
    )
    fun test(given: String?, expected: String?) {
        println("아스키 코드 : https://www.acmicpc.net/problem/11654")
        val br_given = BufferedReader(StringReader(given))
        Assertions.assertThat(java.lang.String.valueOf(No11654.solve(br_given))).isEqualTo(expected)
        br_given.close()
    }
}
