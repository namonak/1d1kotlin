package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10162Test : StringSpec({
    "전자레인지 : https://www.acmicpc.net/problem/10162" {
        val testCases = listOf(
            "100" to "0 1 4",
            "189" to "-1",
        )

        testCases.forEach { (given, expected) ->
            No10162().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
