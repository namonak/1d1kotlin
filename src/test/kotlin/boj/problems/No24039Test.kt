package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24039Test : StringSpec({
    "2021은 무엇이 특별할까? : https://www.acmicpc.net/problem/24039" {
        val testCases = listOf(
            "2020" to "2021",
            "2021" to "2491"
        )

        for ((given, expected) in testCases) {
            No24039().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
