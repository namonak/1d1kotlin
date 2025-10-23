package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3046Test : StringSpec({
    "R2 : https://www.acmicpc.net/problem/3046" {
        val testCases = listOf(
            "11 15" to "19",
            "4 3" to "2"
        )

        testCases.forEach { (given, expected) ->
            No3046().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
