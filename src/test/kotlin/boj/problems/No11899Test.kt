package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11899Test : StringSpec({
    "괄호 끼워넣기 : https://www.acmicpc.net/problem/11899" {
        val testCases = listOf(
            ")))()" to "3",
            ")(()" to "2",
            "))()((" to "4",
            ")(()(()))" to "1"
        )

        for ((given, expected) in testCases) {
            No11899().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
