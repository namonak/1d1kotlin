package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10995Test : StringSpec({
    "별 찍기 - 20 : https://www.acmicpc.net/problem/10995" {
        val testCases = listOf(
            "1" to """
                *
            """.trimIndent(),
            "2" to """
                * * 
                 * *
            """.trimIndent(),
            "3" to """
                * * * 
                 * * * 
                * * *
            """.trimIndent(),
            "4" to """
                * * * * 
                 * * * * 
                * * * * 
                 * * * *
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No10995().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
