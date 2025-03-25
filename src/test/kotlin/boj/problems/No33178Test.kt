package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No33178Test : StringSpec({
    "Micromasters : https://www.acmicpc.net/problem/33178" {
        val testCases = listOf(
            "5" to "0",
            "18" to "1"
        )

        testCases.forEach { (given, expected) ->
            No33178().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
