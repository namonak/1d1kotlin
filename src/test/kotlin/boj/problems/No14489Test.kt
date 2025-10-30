package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14489Test : StringSpec({
    "치킨 두 마리 (...) : https://www.acmicpc.net/problem/14489" {
        val testCases = listOf(
            """
                87 31
                20000
            """.trimIndent() to "118",
            """
                15000 6000
                5000
            """.trimIndent() to "11000",
            """
                1000000000 1000000000
                1000000001
            """.trimIndent() to "2000000000"
        )

        testCases.forEach { (given, expected) ->
            No14489().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
