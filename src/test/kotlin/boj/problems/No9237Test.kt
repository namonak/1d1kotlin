package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9237Test : StringSpec({
    "이장님 초대 : https://www.acmicpc.net/problem/9237" {
        val testCases = listOf(
            """
                4
                2 3 4 3
            """.trimIndent()
                to "7",
            """
                6
                39 38 9 35 39 20
            """.trimIndent()
                to "42"
        )

        testCases.forEach { (given, expected) ->
            No9237().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
