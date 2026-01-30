package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3107Test : StringSpec({
    "IPv6 : https://www.acmicpc.net/problem/3107" {
        val testCases = listOf(
            "25:09:1985:aa:091:4846:374:bb" to "0025:0009:1985:00aa:0091:4846:0374:00bb",
            "::1" to "0000:0000:0000:0000:0000:0000:0000:0001"
        )

        for ((given, expected) in testCases) {
            No3107().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
