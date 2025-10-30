package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18310Test : StringSpec({
    "안테나 : https://www.acmicpc.net/problem/18310" {
        val testCases = listOf(
            "4\n5 1 7 9" to "5",
            "5\n1 2 3 4 5" to "3"
        )

        testCases.forEach { (given, expected) ->
            No18310().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
