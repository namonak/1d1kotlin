package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No22233Test : StringSpec({
    "가희와 키워드 : https://www.acmicpc.net/problem/22233" {
        val testCases = listOf(
            """
                5 2
                map
                set
                dijkstra
                floyd
                os
                map,dijkstra
                map,floyd
            """.trimIndent() to """
                3
                2
            """.trimIndent(),
            """
                2 2
                gt26cw
                1211train
                kiwoom,lottegiant
                kbo
            """.trimIndent() to """
                2
                2
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No22233().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
