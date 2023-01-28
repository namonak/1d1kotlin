package boj.problems.step19

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

class No10773Test {
    @DisplayName("제로")
    @ParameterizedTest
    @CsvSource(value = ["'4\n3\n0\n4\n0':0", "'10\n1\n3\n5\n4\n0\n0\n7\n0\n0\n6':7", "'0\n0\n0\n':0"], delimiter = ':')
    @Throws(
        IOException::class
    )
    fun test(given: String, expected: String) {
        println("제로 : https://www.acmicpc.net/problem/10773")
        val br_given = BufferedReader(StringReader(given))
        Assertions.assertThat(java.lang.String.valueOf(No10773.solve(br_given))).isEqualTo(expected)
        br_given.close()
    }
}