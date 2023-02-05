package boj.problems.step6

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

class No1157Test {
    @DisplayName("단어 공부 테스트")
    @ParameterizedTest
    @CsvSource(value = ["Mississipi:?", "zZa:Z", "z:Z", "baaa:A"], delimiter = ':')
    @Throws(
        IOException::class
    )
    fun test(given: String?, expected: String?) {
        println("단어 공부 : https://www.acmicpc.net/problem/1157")

        // given
        val br_given = BufferedReader(StringReader(given))

        // when
        val actual: Char = No1157.solve(br_given)

        // then
        Assertions.assertEquals(expected, actual.toString())
        br_given.close()
    }
}
