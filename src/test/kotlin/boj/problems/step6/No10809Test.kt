package boj.problems.step6

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

class No10809Test {
    @DisplayName("알파벳 찾기")
    @ParameterizedTest
    @CsvSource(
        value = ["baekjoon:1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1"],
        delimiter = ':'
    )
    @Throws(
        IOException::class
    )
    fun test(given: String?, expected: String?) {
        println("알파벳 찾기 : https://www.acmicpc.net/problem/10809")
        val br_given = BufferedReader(StringReader(given))
        assertThat(No10809.solve(br_given)).isEqualTo(expected)
        br_given.close()
    }
}
