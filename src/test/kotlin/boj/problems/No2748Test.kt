package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2748Test : StringSpec({
    "피보나치 수 2 : https://www.acmicpc.net/problem/2748" {
        val testCases = listOf(
            "10" to "55",
            "90" to "2880067194370816120"
        )

        testCases.forEach { (input, expected) ->
            No2748.solve(input.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
