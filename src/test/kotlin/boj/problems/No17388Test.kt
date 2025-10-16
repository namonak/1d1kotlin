package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17388Test : StringSpec({
    "와글와글 숭고한 : https://www.acmicpc.net/problem/17388" {
        val testCases = listOf(
            "31 41 59" to "OK",
            "1 2 3" to "Soongsil",
            "19 8 9" to "Korea",
            "45 33 21" to "Hanyang"
        )

        testCases.forEach { (given, expected) ->
            No17388().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
