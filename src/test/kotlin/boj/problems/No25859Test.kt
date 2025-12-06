package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25859Test : StringSpec({
    "Sort by Frequency : https://www.acmicpc.net/problem/25859" {
        val testCases = listOf(
            "dcbbdabb" to "bbbbddac",
            "programming" to "ggmmrrainop"
        )

        testCases.forEach { (input, expected) ->
            No25859().solve(input.reader().buffered()) shouldBe expected
        }
    }
})
