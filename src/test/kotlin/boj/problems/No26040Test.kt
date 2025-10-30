package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26040Test : StringSpec({
    "특정 대문자를 소문자로 바꾸기 : https://www.acmicpc.net/problem/26040" {
        val testCases = listOf(
            """
                ABabC
                A
            """.trimIndent() to "aBabC",
            """
                ABabC
                A B D
            """.trimIndent() to "ababC"
        )

        testCases.forEach { (given, expected) ->
            No26040().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
