package boj.problems.step2

import boj.problems.step2.No2525.solve
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

class No2525Test {
    @DisplayName("오븐 시계 테스트")
    @ParameterizedTest
    @CsvSource(value = ["'14 30\n20':14 50", "'17 40\n80':19 0", "'23 48\n25':0 13"], delimiter = ':')
    @Throws(
        IOException::class
    )
    fun test(input: String, expected: String?) {
        println("오븐 시계 : https://www.acmicpc.net/problem/2525")

        // given
        val given = BufferedReader(StringReader(input))

        // when
        val actual = solve(given)

        // then
        assertEquals(expected, actual)

        given.close()
    }
}
