package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No13702Test : StringSpec({
    "이상한 술집 : https://www.acmicpc.net/problem/13702" {
        val testCases = listOf(
            """
                2 3
                702
                429
            """.trimIndent() to "351",
            """
                4 11
                427
                541
                774
                822
            """.trimIndent() to "205"
        )

        testCases.forEach { (given, expected) ->
            No13702().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
