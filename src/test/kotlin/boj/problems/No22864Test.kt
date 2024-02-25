package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No22864Test : StringSpec({
    "피로도 : https://www.acmicpc.net/problem/22864" {
        val testCases = listOf(
            "5 3 2 10" to "24",
            "10 5 1 10" to "15",
            "11 5 1 10" to "0"
        )

        testCases.forEach { (given, expected) ->
            No22864.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
