package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14490Test : StringSpec({
    "백대열 : https://www.acmicpc.net/problem/14490" {
        val testCases = listOf(
            "100:10" to "10:1",
            "18:24" to "3:4"
        )

        for ((given, expected) in testCases) {
            No14490().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
