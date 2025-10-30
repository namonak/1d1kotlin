package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1356Test : StringSpec({
    "유진수 : https://www.acmicpc.net/problem/1356" {
        val testCases = listOf(
            "1236" to "YES",
            "1" to "NO",
            "1221" to "YES",
            "4729382" to "NO",
            "42393338" to "YES"
        )

        testCases.forEach { (given, expected) ->
            No1356().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
