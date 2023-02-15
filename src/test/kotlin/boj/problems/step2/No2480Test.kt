package boj.problems.step2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

class No2480Test {
    @DisplayName("주사위 세개 테스트")
    @ParameterizedTest
    @CsvSource(value = ["3 3 6:1300", "2 2 2:12000", "6 2 5:600"], delimiter = ':')
    @Throws(
        IOException::class
    )
    fun test(given: String?, expected: String?) {
        println("주사위 세게 : https://www.acmicpc.net/problem/2480")

        // given
        val br_given = BufferedReader(StringReader(given))

        // when
        val actual = No2480.solve(br_given)

        // then
        assertEquals(expected, java.lang.String.valueOf(actual))
        br_given.close()
    }
}
