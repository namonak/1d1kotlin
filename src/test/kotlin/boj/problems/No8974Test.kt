package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8974Test : StringSpec({
    "희주의 수학시험 : https://www.acmicpc.net/problem/8974" {
        val testCases = listOf(
            "1 3" to "5",
            "3 7" to "15",
            "50 50" to "10"
        )

        for ((given, expected) in testCases) {
            No8974().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
