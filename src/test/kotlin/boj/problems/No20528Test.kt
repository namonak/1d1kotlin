package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20528Test : StringSpec({
    "끝말잇기 : https://www.acmicpc.net/problem/20528" {
        val testCases = listOf(
            """
                3
                pqqp pqpqp pbbbp
            """.trimIndent() to "1",
            """
                3
                aba c dd
            """.trimIndent() to "0"
        )

        for ((given, expected) in testCases) {
            val result = No20528().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
