package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No14697Test : StringSpec({
    "방 배정하기 : https://www.acmicpc.net/problem/14697" {
        val testCases = listOf(
            "5 9 12 113" to "1",
            "3 6 9 112" to "0"
        )

        testCases.forEach { (given, expected) ->
            No14697().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
