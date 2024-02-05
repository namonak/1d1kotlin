package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28074Test : StringSpec({
    "모비스 : https://www.acmicpc.net/problem/28074" {
        val testCases = listOf(
            "MOIISB" to "YES",
            "MOBI" to "NO",
            "INHACTP" to "NO",
            "MOBII" to "NO"
        )

        testCases.forEach { (given, output) ->
            No28074.solve(given.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
