package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2960Test : StringSpec({
    "에라토스테네스의 체 : https://www.acmicpc.net/problem/2960" {
        val testCases = listOf(
            "7 3" to "6",
            "15 12" to "7",
            "10 7" to "9",
        )

        testCases.forEach { (given, output) ->
            No2960().solve(given.reader().buffered()) shouldBe output
        }
    }
})
