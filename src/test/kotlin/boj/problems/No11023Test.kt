package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11023Test : StringSpec({
    "더하기 3 : https://www.acmicpc.net/problem/11023" {
        val testCases = listOf(
            "1 2 3 4 5" to "15",
            "5 4 5 4 2 3 1 2" to "26"
        )

        testCases.forEach { (given, expected) ->
            No11023().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
