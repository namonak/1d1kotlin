package boj.problems.step3

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25314Test : StringSpec({
    "코딩은 체육과목 입니다 : https://www.acmicpc.net/problem/25314" {
        val testCases = listOf(
            "4" to "long int",
            "20" to "long long long long long int"
        )

        testCases.forEach { (given, expected) ->
            No25314.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
