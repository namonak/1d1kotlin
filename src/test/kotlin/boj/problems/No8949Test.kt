package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8949Test : StringSpec({
    "대충 더해 : https://www.acmicpc.net/problem/8949" {
        val testCases = listOf(
            "512 444" to "956",
            "123 2495" to "25118",
            "99999 99999" to "1818181818"
        )

        testCases.forEach { (given, expected) ->
            No8949().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
