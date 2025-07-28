package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No27434Test : StringSpec({
    "팩토리얼 3 : https://www.acmicpc.net/problem/27434" {
        val testCases = listOf(
            "10" to "3628800",
            "0" to "1"
        )

        testCases.forEach { (given, expected) ->
            val result = No27434().solve(BufferedReader(given.reader()))
            result shouldBe expected
        }
    }
})
