package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No19947Test : StringSpec({
    "투자의 귀재 배주형 : https://www.acmicpc.net/problem/19947" {
        val testCases = listOf(
            "95229 3" to "114274",
            "25542 10" to "46549"
        )

        testCases.forEach { (given, expected) ->
            No19947().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
