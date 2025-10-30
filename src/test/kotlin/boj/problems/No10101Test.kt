package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10101Test : StringSpec({
    "삼각형 외우기 : https://www.acmicpc.net/problem/10101" {
        val testCases = listOf(
            """
                60
                70
                50
            """.trimIndent() to "Scalene",
            """
                60
                60
                60
            """.trimIndent() to "Equilateral",
            """
                70
                70
                40
            """.trimIndent() to "Isosceles",
            """
                45
                45
                100
            """.trimIndent() to "Error",
        )

        testCases.forEach { (given, expected) ->
            No10101().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
