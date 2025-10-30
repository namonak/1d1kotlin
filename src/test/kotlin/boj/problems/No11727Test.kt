package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11727Test : StringSpec({
    "2×n 타일링 2 : https://www.acmicpc.net/problem/11727" {
        val testCases = listOf(
            "2" to "3",
            "8" to "171",
            "12" to "2731"
        )

        testCases.forEach { (given, expected) ->
            No11727().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
