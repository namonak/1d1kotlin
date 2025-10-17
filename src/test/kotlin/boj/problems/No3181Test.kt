package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3181Test : StringSpec({
    "줄임말 만들기 : https://www.acmicpc.net/problem/3181" {
        val testCases = listOf(
            "micro soft" to "MS",
            "biti ali i ne biti" to "BNB",
            "ali ja sam i jucer jeo" to "AJSJJ"
        )

        testCases.forEach { (given, expected) ->
            No3181().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
