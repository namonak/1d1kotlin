package boj.problems.step9

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No2501Test : StringSpec({
    "약수 구하기 : https://www.acmicpc.net/problem/2501" {
        val testCases = listOf(
            "6 3" to 3,
            "25 4" to 0,
            "2735 1" to 1
        )

        testCases.forEach { (given, expected) ->
            val actual = No2501.solve(BufferedReader(StringReader(given)))

            actual shouldBe expected
        }
    }
})
