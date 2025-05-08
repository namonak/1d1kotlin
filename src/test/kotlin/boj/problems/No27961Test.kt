package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No27961Test : StringSpec({
    "고양이는 많을수록 좋다 : https://www.acmicpc.net/problem/27961" {
        val testCases = listOf(
            "1" to "1",
            "6" to "4",
            "2147483648" to "32"
        )

        testCases.forEach { (given, expected) ->
            No27961().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
