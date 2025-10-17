package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14581Test : StringSpec({
    "팬들에게 둘러싸인 홍준 : https://www.acmicpc.net/problem/14581" {
        val testCases = listOf(
            "appa" to """
                :fan::fan::fan:
                :fan::appa::fan:
                :fan::fan::fan:
            """.trimIndent(),
            "h0ngjun7" to """
                :fan::fan::fan:
                :fan::h0ngjun7::fan:
                :fan::fan::fan:
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No14581().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
