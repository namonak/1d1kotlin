package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17828Test : StringSpec({
    "문자열 화폐 : https://www.acmicpc.net/problem/17828" {
        val testCases = listOf(
            "6 64" to "AAAIZZ",
            "6 157" to "!"
        )

        testCases.forEach { (given, expected) ->
            No17828().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
