package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2870Test : StringSpec({
    "수학숙제 : https://www.acmicpc.net/problem/2870" {
        val testCases = listOf(
            """
                2
                lo3za4
                01
            """.trimIndent() to """
                1
                3
                4
            """.trimIndent(),
            """
                4
                43silos0
                zita002
                le2sim
                231233
            """.trimIndent() to """
                0
                2
                2
                43
                231233
            """.trimIndent(),
            """
                4
                01bond
                02james007
                03bond
                04austinpowers000
            """.trimIndent() to """
                0
                1
                2
                3
                4
                7
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No2870().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
