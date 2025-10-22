package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2908Test : StringSpec({
    "상수 : https://www.acmicpc.net/problem/2908" {
        val testCases = listOf(
            "734 893" to "437",
            "221 231" to "132",
            "839 237" to "938"
        )

        testCases.forEach { (given, expected) ->
            No2908().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
