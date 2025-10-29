package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2752Test : StringSpec({
    "세수정렬 : https://www.acmicpc.net/problem/2752" {
        val testCases = listOf(
            "3 1 2" to "1 2 3",
            "3 2 1" to "1 2 3",
            "1 3 2" to "1 2 3",
            "1 2 3" to "1 2 3",
            "2 1 3" to "1 2 3",
            "2 3 1" to "1 2 3"
        )

        testCases.forEach { (given, expected) ->
            No2752().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
