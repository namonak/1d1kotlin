package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1260Test : StringSpec({
    "DFS와 BFS : https://www.acmicpc.net/problem/1260" {
        val testCases = listOf(
            """
                4 5 1
                1 2
                1 3
                1 4
                2 4
                3 4
            """.trimIndent()
                to """
                   1 2 4 3
                   1 2 3 4
                """.trimIndent(),
            """
                5 5 3
                5 4
                5 2
                1 2
                3 4
                3 1
            """.trimIndent()
                to """
                    3 1 2 5 4
                    3 1 4 2 5
                """.trimIndent(),
            """
                1000 1 1000
                999 1000
            """.trimIndent()
                to """
                    1000 999
                    1000 999
                """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No1260.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
