package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No16928Test : StringSpec({
    "뱀과 사다리 게임 : https://www.acmicpc.net/problem/16928" {
        val testCases = listOf(
            """
                3 7
                32 62
                42 68
                12 98
                95 13
                97 25
                93 37
                79 27
                75 19
                49 47
                67 17
            """.trimIndent() to "3",
            """
                4 9
                8 52
                6 80
                26 42
                2 72
                51 19
                39 11
                37 29
                81 3
                59 5
                79 23
                53 7
                43 33
                77 21
            """.trimIndent() to "5"
        )

        testCases.forEach { (given, expected) ->
            No16928().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
