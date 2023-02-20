package boj.problems.step6

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

internal class No11720Test {
    @DisplayName("숫자의 합 테스트")
    @ParameterizedTest
    @CsvSource(
        value = ["'1\n1\n':1", "'5\n54321\n':15", "'25\n7000000000000000000000000\n':7", "'11\n10987654321\n':46"],
        delimiter = ':'
    )
    @Throws(IOException::class)
    fun test(input: String, expected: String) {
        println("숫자의 합 : https://www.acmicpc.net/problem/11720")

        // given
        val given = BufferedReader(StringReader(input))

        // when
        val actual = No11720.solve(given).toString()

        // then
        assertThat(actual).isEqualTo(expected)

        given.close()
    }
}
