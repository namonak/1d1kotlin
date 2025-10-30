package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17350Test : StringSpec({
    "2루수 이름이 뭐야 : https://www.acmicpc.net/problem/17350" {
        val testCases = listOf(
            """
                3
                snrn
                anj
                ahffk
            """.trimIndent() to "뭐야;",
            """
                4
                aptl
                molamolamolamola
                dlqmfkglahqlcl
                QWERTOP
            """.trimIndent() to "뭐야?"
        )

        testCases.forEach { (given, expected) ->
            No17350().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
