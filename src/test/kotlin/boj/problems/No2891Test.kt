package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2891Test : StringSpec({
    "카약과 강풍 : https://www.acmicpc.net/problem/2891" {
        val testCases = listOf(
            """
                5 2 1
                2 4
                3
            """.trimIndent() to "1",
            """
                5 2 3
                2 4
                1 3 5
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No2891().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
