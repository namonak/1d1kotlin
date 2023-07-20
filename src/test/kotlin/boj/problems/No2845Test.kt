package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2845Test : StringSpec({
    "파티가 끝나고 난 뒤 : https://www.acmicpc.net/problem/2845" {
        val testCases = listOf(
            "1 10\n10 10 10 10 10" to "0 0 0 0 0",
            "5 20\n99 101 1000 0 97" to "-1 1 900 -100 -3"
        )

        testCases.forEach { (given, expected) ->
            val actual = No2845.solve(BufferedReader(given.reader()))

            actual shouldBe expected
        }
    }
})
