package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No13301Test : StringSpec({
    "타일 장식물 : https://www.acmicpc.net/problem/13301" {
        val testCases = listOf(
            "5" to "26",
            "6" to "42"
        )

        testCases.forEach { (given, expected) ->
            No13301().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
