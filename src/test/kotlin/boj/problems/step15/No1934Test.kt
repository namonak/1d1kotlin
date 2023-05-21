package boj.problems.step15

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No1934Test : StringSpec({
    "최소공배수 : https://www.acmicpc.net/problem/1934" {
        val testCases = listOf(
            "3\n1 45000\n6 10\n13 17" to "45000\n30\n221"
        )

        testCases.forEach { (given, expected) ->
            val actual = No1934.solve(BufferedReader(StringReader(given)))

            actual shouldBe expected
        }
    }
})
