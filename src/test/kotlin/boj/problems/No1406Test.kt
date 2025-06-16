package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1406Test : StringSpec({
    "에디터 : https://www.acmicpc.net/problem/1406" {
        val testCases = listOf(
            """
                abcd
                3
                P x
                L
                P y
            """.trimIndent() to "abcdyx",
            """
                abc
                9
                L
                L
                L
                L
                L
                P x
                L
                B
                P y
            """.trimIndent() to "yxabc",
            """
                dmih
                11
                B
                B
                P x
                L
                B
                B
                B
                P y
                D
                D
                P z
            """.trimIndent() to "yxz"
        )

        testCases.forEach { (given, expected) ->
            val actual = No1406().solve(BufferedReader(given.reader()))
            actual shouldBe expected
        }
    }
})
