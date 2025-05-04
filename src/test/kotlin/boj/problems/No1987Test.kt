package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1987Test : StringSpec({
    "알파벳 : https://www.acmicpc.net/problem/1987" {
        val testCases = listOf(
            """
                2 4
                CAAB
                ADCB
            """.trimIndent() to "3",
            """
                3 6
                HFDFFB
                AJHGDH
                DGAGEH
            """.trimIndent() to "6",
            """
                5 5
                IEFCJ
                FHFKC
                FFALF
                HFGCF
                HMCHH
            """.trimIndent() to "10"
        )

        testCases.forEach { (given, expected) ->
            No1987().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
