package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11608Test : StringSpec({
    "Complexity : https://www.acmicpc.net/problem/11608" {
        val testCases = listOf(
            "string" to "4",
            "letter" to "2",
            "aaaaaa" to "0",
            "uncopyrightable" to "13",
            "ambidextrously" to "12",
            "assesses" to "1",
            "assassins" to "2"
        )

        for ((given, expected) in testCases) {
            No11608().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
