package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15873Test : StringSpec({
    "공백 없는 A+B : https://www.acmicpc.net/problem/15873" {
        val testCases = listOf(
            "37" to "10",
            "102" to "12"
        )

        testCases.forEach { (given, output) ->
            No15873().solve(given.reader().buffered()) shouldBe output
        }
    }
})
