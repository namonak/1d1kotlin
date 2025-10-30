package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17863Test : StringSpec({
    "FYI : https://www.acmicpc.net/problem/17863" {
        val testCases = listOf(
            "5551212" to "YES",
            "5519876" to "NO",
            "5055555" to "NO",
            "5550000" to "YES",
        )

        testCases.forEach { (given, expected) ->
            No17863().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
