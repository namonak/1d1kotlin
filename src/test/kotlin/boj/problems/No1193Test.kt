package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1193Test : StringSpec({
    "분수찾기 : https://www.acmicpc.net/problem/1193" {
        val testCases = listOf(
            "1" to "1/1",
            "2" to "1/2",
            "3" to "2/1",
            "4" to "3/1",
            "5" to "2/2",
            "6" to "1/3",
            "7" to "1/4",
            "8" to "2/3",
            "9" to "3/2",
            "14" to "2/4"
        )

        testCases.forEach { (given, expected) ->
            No1193().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
