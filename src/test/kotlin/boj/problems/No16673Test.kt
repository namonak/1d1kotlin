package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No16673Test : StringSpec({
    "고려대학교에는 공식 와인이 있다 : https://www.acmicpc.net/problem/16673" {
        val testCases = listOf(
            "3 1 1" to "20",
            "5 28 27" to "1905"
        )

        testCases.forEach { (given, expected) ->
            No16673().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
