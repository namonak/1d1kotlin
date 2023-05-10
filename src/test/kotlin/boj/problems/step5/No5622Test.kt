package boj.problems.step5

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class No5622Test : StringSpec({
    "다이얼 : https://www.acmicpc.net/problem/5622" {
        // given
        val testCases = listOf(
            row("WA", 13),
            row("UNUCIC", 36),
        )

        // when, then
        testCases.forEach { (given, expected) ->
            No5622.solve(given) shouldBe expected
        }
    }
})
