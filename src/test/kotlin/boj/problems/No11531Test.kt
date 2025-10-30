package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11531Test : StringSpec({
    "ACM 대회 채점 : https://www.acmicpc.net/problem/11531" {
        val testCases = listOf(
            """
                3 E right
                10 A wrong
                30 C wrong
                50 B wrong
                100 A wrong
                200 A right
                250 C wrong
                300 D right
                -1
            """.trimIndent() to "3 543",
            """
                7 H right
                15 B wrong
                30 E wrong
                35 E right
                80 B wrong
                80 B right
                100 D wrong
                100 C wrong
                300 C right
                300 D wrong
                -1
            """.trimIndent() to "4 502"
        )

        testCases.forEach { (given, expected) ->
            val result = No11531().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
