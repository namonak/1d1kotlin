package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No30804Test : StringSpec({
    "과일 탕후루 : https://www.acmicpc.net/problem/30804" {
        fun generateMaxInputTestCase(): String {
            val maxN = 200_000
            val fruits = List(maxN) { if (it % 2 == 0) "1" else "2" }.joinToString(" ")
            return """
                    $maxN
                    $fruits
                """.trimIndent()
        }

        val testCases = listOf(
            """
                5
                5 1 1 2 1
            """.trimIndent() to "4",
            """
                3
                1 1 1
            """.trimIndent() to "3",
            """
                9
                1 2 3 4 5 6 7 8 9
            """.trimIndent() to "2",
            """
                1
                1
            """.trimIndent() to "1",
            """
                10
                1 2 3 4 5 6 7 8 9 1
            """.trimIndent() to "2",
            """
                10
                1 2 1 2 1 2 1 2 1 2
            """.trimIndent() to "10",
            """
                6
                1 1 1 2 2 3
            """.trimIndent() to "5",
            """
                10
                1 1 1 1 3 4 5 1 1 1
            """.trimIndent() to "5",
            """
                7
                1 1 1 2 1 1 1
            """.trimIndent() to "7",
            generateMaxInputTestCase() to "200000"
        )

        testCases.forEach { (given, expected) ->
            No30804().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
