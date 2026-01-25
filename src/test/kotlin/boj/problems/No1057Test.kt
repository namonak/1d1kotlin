package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1057Test : StringSpec({
    "토너먼트 : https://www.acmicpc.net/problem/1057" {
        val testCases = listOf(
            "16 1 2" to "1",
            "16 8 9" to "4",
            "1000 20 31" to "4",
            "65536 1000 35000" to "16",
            "60000 101 891" to "10"
        )

        for ((given, expected) in testCases) {
            No1057().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
