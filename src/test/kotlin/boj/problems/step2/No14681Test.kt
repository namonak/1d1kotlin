package boj.problems.step2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.io.BufferedReader
import java.io.IOException
import java.io.StringReader

class No14681Test {
    @DisplayName("사분면 고르기 테스트")
    @ParameterizedTest
    @CsvSource(value = ["'12\n5\n':1", "'9\n-13\n':4"], delimiter = ':')
    @Throws(
        IOException::class
    )
    fun test(given: String?, expected: String?) {
        println("사분면 고르기 : https://www.acmicpc.net/problem/14681")
        val br_given = BufferedReader(StringReader(given))
        Assertions.assertEquals(expected, java.lang.String.valueOf(No14681.solve(br_given)))
        br_given.close()
    }
}
