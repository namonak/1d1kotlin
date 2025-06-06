package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2858Test : StringSpec({
    "기숙사 바닥 : https://www.acmicpc.net/problem/2858" {
        val testCases = listOf(
            "8 1" to "3 3",
            "10 2" to "4 3",
            "24 24" to "8 6"
        )

        testCases.forEach { (given, expected) ->
            No2858().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
