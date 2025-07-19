package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No18005Test : StringSpec({
    "Even or Odd? : https://www.acmicpc.net/problem/18005" {
        val testCases = listOf(
            "3" to "0",
            "6" to "1",
            "12" to "2"
        )

        testCases.forEach { (given, expected) ->
            val actual = No18005().solve(BufferedReader(given.reader()))
            actual shouldBe expected
        }
    }
})
