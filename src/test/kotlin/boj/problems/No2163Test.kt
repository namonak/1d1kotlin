package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2163Test : StringSpec({
    "초콜릿 자르기 : https://www.acmicpc.net/problem/2163" {
        val testCases = listOf(
            "2 2" to 3,
            "1 1" to 0,
        )

        testCases.forEach { (given, expected) ->
            val actual = No2163.solve(BufferedReader(given.reader()))

            actual shouldBe expected
        }
    }
})
