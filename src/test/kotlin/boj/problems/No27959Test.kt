package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27959Test : StringSpec({
    "초코바 : https://www.acmicpc.net/problem/27959" {
        val testCases = listOf(
            "30 300" to "Yes",
            "5 10000" to "No",
            "7 785" to "No"
        )

        testCases.forEach { (given, expected) ->
            No27959().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
