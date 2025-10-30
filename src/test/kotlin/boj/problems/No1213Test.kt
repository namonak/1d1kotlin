package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1213Test : StringSpec({
    "팰린드롬 만들기 : https://www.acmicpc.net/problem/1213" {
        val testCases = listOf(
            "AABB" to "ABBA",
            "AAABB" to "ABABA",
            "ABACABA" to "AABCBAA",
            "ABCD" to "I'm Sorry Hansoo"
        )

        testCases.forEach { (given, expected) ->
            No1213().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
