package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5014Test : StringSpec({
    "스타트링크 : https://www.acmicpc.net/problem/5014" {
        val testCases = listOf(
            "10 1 10 2 1" to "6",
            "100 2 1 1 0" to "use the stairs"
        )

        testCases.forEach { (given, expected) ->
            No5014().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
