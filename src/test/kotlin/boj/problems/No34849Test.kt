package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No34849Test : StringSpec({
    "이중 반복문 : https://www.acmicpc.net/problem/34849" {
        val testCases = listOf(
            "1000" to "Accepted",
            "100000" to "Time limit exceeded"
        )

        testCases.forEach { (input, expected) ->
            No34849().solve(input.reader().buffered()) shouldBe expected
        }
    }
})
