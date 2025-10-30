package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25704Test : StringSpec({
    "출석 이벤트 : https://www.acmicpc.net/problem/25704" {
        val testCases = listOf(
            """
                12
                50000
            """.trimIndent() to "45000",
            """
                23
                3000
            """.trimIndent() to "1000"
        )

        testCases.forEach { (given, expected) ->
            No25704().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
