package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10707Test : StringSpec({
    "수도요금 : https://www.acmicpc.net/problem/10707" {
        val testCases = listOf(
            """
                9
                100
                20
                3
                10
            """.trimIndent() to "90",
            """
                8
                300
                100
                10
                250
            """.trimIndent() to "1800"
        )

        testCases.forEach { (given, expected) ->
            No10707().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
