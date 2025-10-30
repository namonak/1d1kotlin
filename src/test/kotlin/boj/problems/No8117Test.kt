package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8117Test : StringSpec({
    "Triangles : https://www.acmicpc.net/problem/8117" {
        val testCases = listOf(
            """
                250
                1
                105
                150
                325
                99999
                73
                0
            """.trimIndent() to "73 105 150",
            """
                105
                325
                55
                12555
                1700
                0
            """.trimIndent() to "NIE"
        )

        testCases.forEach { (given, expected) ->
            No8117().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
