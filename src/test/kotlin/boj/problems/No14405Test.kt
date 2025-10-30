package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14405Test : StringSpec({
    "피카츄 : https://www.acmicpc.net/problem/14405" {
        val testCases = listOf(
            "pikapi" to "YES",
            "pipikachu" to "YES",
            "pikaqiu" to "NO",
            "piika" to "NO",
            "chupikachupipichu" to "YES",
        )

        testCases.forEach { (given, expected) ->
            No14405().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
