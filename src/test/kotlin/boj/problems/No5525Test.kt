package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5525Test : StringSpec({
    "IOIOI : https://www.acmicpc.net/problem/5525" {
        val testCases = listOf(
            """
                1
                13
                OOIOIOIOIIOII
            """.trimIndent() to "4",
            """
                2
                13
                OOIOIOIOIIOII
            """.trimIndent() to "2"
        )

        testCases.forEach { (given, expected) ->
            No5525().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
