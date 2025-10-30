package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No33990Test : StringSpec({
    "3대 512 : https://www.acmicpc.net/problem/33990" {
        val testCases = listOf(
            """
                5
                60 80 90
                10 10 10
                200 200 200
                85 140 145
                125 187 200
            """.trimIndent() to "512",
            """
                3
                40 70 80
                0 0 0
                60 100 120
            """.trimIndent() to "-1"
        )

        testCases.forEach { (given, expected) ->
            val result = No33990().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
