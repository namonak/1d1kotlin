package boj.problems.step2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

class No1330Test {
    @DisplayName("두 수 비교하기 테스트")
    @ParameterizedTest
    @CsvSource(value = ["1 2:<", "10 2:>", "5 5:=="], delimiter = ':')
    @Throws(IOException::class)
    fun test(input: String, expected: String?) {
        println("두 수 비교하기 : https://www.acmicpc.net/problem/1330")

        // given
        val given = BufferedReader(StringReader(input))

        // when
        val actual = No1330.solve(given)

        // then
        assertEquals(expected, actual)

        given.close()
    }
}
