package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13699Test : StringSpec({
    "점화식 : https://www.acmicpc.net/problem/13699" {
        val testCases = listOf(
            "0" to "1",
            "3" to "5",
            "25" to "4861946401452"
        )

        testCases.forEach { (given, expected) ->
            No13699().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
