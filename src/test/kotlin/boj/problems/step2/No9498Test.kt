package boj.problems.step2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

class No9498Test {
    @DisplayName("시험 성적 테스트")
    @ParameterizedTest
    @CsvSource(
        value = ["100:A", "90:A", "89:B", "80:B", "79:C", "70:C", "69:D", "60:D", "59:F", "0:F"],
        delimiter = ':'
    )
    @Throws(IOException::class)
    fun test(input: String, expected: String) {
        println("시험 성적 : https://www.acmicpc.net/problem/9498")

        // given
        val given = BufferedReader(StringReader(input))

        // when
        val actual = No9498.solve(given)

        // then
        assertThat(actual).isEqualTo(expected)

        given.close()
    }
}
