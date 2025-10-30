package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16462Test : StringSpec({
    "'나교수' 교수님의 악필 : https://www.acmicpc.net/problem/16462" {
        val testCases = listOf(
            """
                5
                96
                60
                100
                88
                6
            """.trimIndent() to "79",
            """
                4
                36
                49
                64
                100
            """.trimIndent() to "71"
        )

        testCases.forEach { (given, expected) ->
            No16462().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
