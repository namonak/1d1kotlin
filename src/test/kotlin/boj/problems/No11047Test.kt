package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11047Test : StringSpec({
    "동전 0 : https://www.acmicpc.net/problem/11047" {
        val testCases = listOf(
            """
                10 4200
                1
                5
                10
                50
                100
                500
                1000
                5000
                10000
                50000
            """.trimIndent() to
                6,
            """
                10 4790
                1
                5
                10
                50
                100
                500
                1000
                5000
                10000
                50000
            """.trimIndent() to
                12
        )

        testCases.forEach { (input, expected) ->
            No11047.solve(BufferedReader(input.reader())) shouldBe expected
        }
    }
})
