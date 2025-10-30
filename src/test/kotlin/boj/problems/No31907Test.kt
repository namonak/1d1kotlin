package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31907Test : StringSpec({
    "GIST 찍기 : https://www.acmicpc.net/problem/31907" {
        val testCases = listOf(
            "1" to """
                G...
                .I.T
                ..S.
            """.trimIndent(),
            "5" to """
                GGGGG...............
                GGGGG...............
                GGGGG...............
                GGGGG...............
                GGGGG...............
                .....IIIII.....TTTTT
                .....IIIII.....TTTTT
                .....IIIII.....TTTTT
                .....IIIII.....TTTTT
                .....IIIII.....TTTTT
                ..........SSSSS.....
                ..........SSSSS.....
                ..........SSSSS.....
                ..........SSSSS.....
                ..........SSSSS.....
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            val result = No31907().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
