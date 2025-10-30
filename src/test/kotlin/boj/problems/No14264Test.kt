package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14264Test : StringSpec({
    "정육각형과 삼각형 : https://www.acmicpc.net/problem/14264" {
        val testCases = listOf(
            "5" to "10.825317547305481",
            "10" to "43.301270189221924",
            "100000" to "4.330127018922193E9"
        )

        testCases.forEach { (given, expected) ->
            No14264().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
