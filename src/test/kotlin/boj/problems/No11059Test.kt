package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11059Test : StringSpec({
    "크리 문자열 : https://www.acmicpc.net/problem/11059" {
        val testCases = listOf(
            "67896789" to "8",
            "6789789" to "6",
            "6789678" to "4"
        )

        testCases.forEach { (given, expected) ->
            No11059().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
