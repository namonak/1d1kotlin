package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11816Test : StringSpec({
    "8진수, 10진수, 16진수 : https://www.acmicpc.net/problem/11816" {
        val testCases = listOf(
            "10" to "10",
            "010" to "8",
            "0x10" to "16",
            "0x3f6" to "1014"
        )

        testCases.forEach { (given, expected) ->
            No11816().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
