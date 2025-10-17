package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3053Test : StringSpec({
    "택시 기하학 : https://www.acmicpc.net/problem/3053" {
        val testCases = listOf(
            "1" to """
                3.141593
                2.000000
            """.trimIndent(),
            "21" to """
                1385.442360
                882.000000
            """.trimIndent(),
            "42" to """
                5541.769441
                3528.000000
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No3053().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
