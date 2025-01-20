package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No25814Test : StringSpec({
    "Heavy Numbers : https://www.acmicpc.net/problem/25814" {
        val testCases = listOf(
            "59 1001" to "1",
            "8 567" to "2",
            "123 90" to "0"
        )

        testCases.forEach { (given, expected) ->
            No25814().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
