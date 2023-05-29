package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No1316Test : StringSpec({
    "그룹 단어 체커 : https://www.acmicpc.net/problem/1316" {
        val testCases = listOf(
            "3\nhappy\nnew\nyear" to 3,
            "4\naba\nabab\nabcabc\na" to 1,
            "5\nab\naa\naca\nba\nbb" to 4,
            "2\nyzyzy\nzyzyz" to 0,
            "1\nz" to 1,
            "9\naaa\naaazbz\nbabb\naazz\nazbz\naabbaa\nabacc\naba\nzzaz" to 2
        )

        testCases.forEach { (given, expected) ->
            val actual = No1316.solve(BufferedReader(StringReader(given)))
            actual shouldBe expected
        }
    }
})
