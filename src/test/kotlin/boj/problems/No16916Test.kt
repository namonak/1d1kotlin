package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16916Test : StringSpec({
    "부분 문자열 : https://www.acmicpc.net/problem/16916" {
        val testCases = listOf(
            "baekjoon\naek" to "1",
            "baekjoon\nbak" to "0",
            "baekjoon\njoo" to "1",
            "baekjoon\noone" to "0",
            "baekjoon\nonline" to "0",
            "baekjoon\nbaekjoon\n" to "1"
        )

        testCases.forEach { (given, output) ->
            No16916.solve(given.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
