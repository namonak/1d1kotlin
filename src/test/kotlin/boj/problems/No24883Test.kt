package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24883Test : StringSpec({
    "자동완성 : https://www.acmicpc.net/problem/24883" {
        val testCases = listOf(
            "N" to "Naver D2",
            "n" to "Naver D2",
            "A" to "Naver Whale",
            "g" to "Naver Whale"
        )

        for ((given, expected) in testCases) {
            No24883().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
