package boj.problems.step27

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2805Test : StringSpec({
    "나무 자르기 : https://www.acmicpc.net/problem/2805" {
        val testCases = listOf(
            "4 7\n20 15 10 17" to 15,
            "5 20\n4 42 40 26 46" to 36,
        )

        testCases.forEach { (given, expected) ->
            val actual = No2805.solve(BufferedReader(given.reader()))

            actual shouldBe expected
        }
    }
})
