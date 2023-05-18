package boj.problems.step10

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No27323Test : StringSpec({
    "직사각형 : https://www.acmicpc.net/problem/27323" {
        val testCases = listOf(
            "2\n3" to 6,
            "100\n1" to 100,
            "4\n4" to 16
        )

        testCases.forEach { (input, expected) ->
            val actual = No27323.solve(BufferedReader(StringReader(input)))

            actual shouldBe expected
        }
    }
})
