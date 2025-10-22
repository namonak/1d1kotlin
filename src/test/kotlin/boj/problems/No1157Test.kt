package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1157Test : StringSpec({
    "단어 공부 : https://www.acmicpc.net/problem/1157" {
        val testCases = listOf(
            "Mississipi" to "?",
            "zZa" to "Z",
            "z" to "Z",
            "baaa" to "A"
        )

        testCases.forEach { (given, expected) ->
            No1157().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
