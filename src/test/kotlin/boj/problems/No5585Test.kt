package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5585Test : StringSpec({
    "거스름돈 : https://www.acmicpc.net/problem/5585" {
        val testCases = listOf(
            "380" to "4",
            "1" to "15"
        )

        testCases.forEach { (given, expected) ->
            No5585().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
