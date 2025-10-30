package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17269Test : StringSpec({
    "이름궁합 테스트 : https://www.acmicpc.net/problem/17269" {
        val testCases = listOf(
            """
                8 14
                LEESIYUN MIYAWAKISAKURA
            """.trimIndent() to "27%",
            """
                2 2
                AB CD
            """.trimIndent() to "77%",
            """
                3 2
                BOJ IN
            """.trimIndent() to "1%"
        )

        testCases.forEach { (given, expected) ->
            No17269().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
