package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15786Test : StringSpec({
    "Send me the money : https://www.acmicpc.net/problem/15786" {
        val testCases = listOf(
            """
                4 5
                PPAP
                PPAPP
                PPPPA
                APPPP
                PPPAP
                PAPAP
            """.trimIndent() to """
                true
                false
                false
                true
                true
            """.trimIndent(),
            """
                3 2
                CTP
                P
                CHALLENGETHEPROGRAMING
            """.trimIndent() to """
                false
                true
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            val actual = No15786().solve(BufferedReader(given.reader()))
            actual shouldBe expected
        }
    }
})
