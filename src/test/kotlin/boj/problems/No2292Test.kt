package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2292Test : StringSpec({
    "벌집 : https://www.acmicpc.net/problem/2292" {
        val testCases = listOf(
            "13" to "3",
            "1" to "1",
            "2" to "2",
            "7" to "2",
            "5" to "2",
            "37" to "4",
            "38" to "5",
            "64" to "6"
        )

        testCases.forEach { (given, expected) ->
            No2292().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
