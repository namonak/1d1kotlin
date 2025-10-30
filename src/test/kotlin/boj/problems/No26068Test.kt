package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26068Test : StringSpec({
    "치킨댄스를 추는 곰곰이를 본 임스 2 : https://www.acmicpc.net/problem/26068" {
        val testCases = listOf(
            """
                3
                D-86
                D-8
                D-6
            """.trimIndent() to "3",
            """
                4
                D-98
                D-5
                D-94
                D-2
            """.trimIndent() to "2"
        )

        testCases.forEach { (input, output) ->
            No26068().solve(input.reader().buffered()) shouldBe output
        }
    }
})
