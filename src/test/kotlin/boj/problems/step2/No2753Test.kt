package boj.problems.step2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

class No2753Test {
    @DisplayName("윤년 테스트")
    @ParameterizedTest
    @CsvSource(value = ["2000:1", "1999:0", "1900:0"], delimiter = ':')
    @Throws(
        IOException::class
    )
    fun test(input: String, expected: String) {
        println("윤년 : https://www.acmicpc.net/problem/2753")

        // given
        val given = BufferedReader(StringReader(input))

        // when
        val actual = No2753.solve(given).toString()

        // then
        assertThat(actual).isEqualTo(expected)

        given.close()
    }
}
