package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5543Test : StringSpec({
    "상근날드 : https://www.acmicpc.net/problem/5543" {
        val testCases = listOf(
            """
                800
                700
                900
                198
                330
            """.trimIndent() to "848",
            """
                1999
                1999
                100
                189
                100
            """.trimIndent() to "150"
        )

        testCases.forEach { (given, expected) ->
            No5543().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
