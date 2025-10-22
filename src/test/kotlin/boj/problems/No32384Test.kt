package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32384Test : StringSpec({
    "사랑은 고려대입니다 : https://www.acmicpc.net/problem/32384" {
        val testCases = listOf(
            "1" to "LoveisKoreaUniversity",
            "2" to "LoveisKoreaUniversity LoveisKoreaUniversity"
        )

        for ((given, expected) in testCases) {
            No32384().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
