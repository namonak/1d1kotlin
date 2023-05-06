package boj.problems.step5

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.InputStreamReader

class No27866Test : StringSpec({
    "문자와 문자열 : https://www.acmicpc.net/problem/27866" {
        // given
        val testCases = listOf(
            row("Sprout\n3", "r"),
            row("shiftpsh\n6", "p"),
            row("Baekjoon\n4", "k")
        )

        testCases.forEach { (given, expected) ->
            val actual = No27866.solve(BufferedReader(InputStreamReader(given.byteInputStream())))
            actual shouldBe expected
        }
    }
})
