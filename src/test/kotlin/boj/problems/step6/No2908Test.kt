package boj.problems.step6

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

class No2908Test {
    @DisplayName("상수 테스트")
    @ParameterizedTest
    @CsvSource(value = ["734 893:437", "221 231:132", "839 237:938"], delimiter = ':')
    @Throws(
        IOException::class
    )
    fun test(given: String?, expected: String?) {
        println("상수 : https://www.acmicpc.net/problem/2908")
        val br_given = BufferedReader(StringReader(given))
        Assertions.assertThat(java.lang.String.valueOf(No2908.solve(br_given))).isEqualTo(expected)
        br_given.close()
    }
}
