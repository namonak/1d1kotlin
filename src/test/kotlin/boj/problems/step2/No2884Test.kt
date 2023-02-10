package boj.problems.step2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

class No2884Test {
    @DisplayName("알람 시계 테스트")
    @ParameterizedTest
    @CsvSource(value = ["10 10:9 25", "0 30:23 45", "23 40:22 55"], delimiter = ':')
    @Throws(
        IOException::class
    )
    fun test(given: String?, expected: String?) {
        println("알람 시계 : https://www.acmicpc.net/problem/2884")

        // given
        val br_given = BufferedReader(StringReader(given))

        // when
        val actual = No2884.solve(br_given)

        // then
        assertEquals(expected, actual)

        br_given.close()
    }
}
