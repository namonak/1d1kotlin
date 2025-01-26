package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15734Test : StringSpec({
    "명장 남정훈 : https://www.acmicpc.net/problem/15734" {
        val testCases = listOf(
            "1 5 2" to "6",
            "7 7 7" to "20"
        )

        testCases.forEach { (given, expected) ->
            No15734().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
