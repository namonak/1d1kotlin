package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14244Test : StringSpec({
    "트리 만들기 : https://www.acmicpc.net/problem/14244" {
        val testCases = listOf(
            "4 2" to """
                0 1
                0 2
                1 3
            """.trimIndent(),
            "5 4" to """
                0 1
                0 2
                0 3
                0 4
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No14244().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
