package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14928Test : StringSpec({
    "큰 수 (BIG) : https://www.acmicpc.net/problem/14928" {
        val testCases = listOf(
            "20000303200003032000030320000303200003032000030320000303200003032000030320000303" to "0",
            "123456789123456789123456789123456789123456789123456789123456789123456789" to "1313652"
        )

        testCases.forEach { (given, expected) ->
            No14928().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
