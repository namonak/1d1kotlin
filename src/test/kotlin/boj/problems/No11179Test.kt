package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11179Test : StringSpec({
    "2진수 뒤집기 : https://www.acmicpc.net/problem/11179" {
        val testCases = listOf(
            "13" to "11",
            "47" to "61"
        )

        testCases.forEach { (given, expected) ->
            No11179().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
