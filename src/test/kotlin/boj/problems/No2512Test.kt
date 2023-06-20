package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2512Test : StringSpec({
    "예산 : https://www.acmicpc.net/problem/2512" {
        val testCases = listOf(
            "4\n120 110 140 150\n485" to 127,
            "5\n70 80 30 40 100\n450" to 100
        )

        testCases.forEach { (given, expected) ->
            val actual = No2512.solve(BufferedReader(given.reader()))

            actual shouldBe expected
        }
    }
})
