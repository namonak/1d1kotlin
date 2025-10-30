package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10830Test : StringSpec({
    "행렬 제곱 : https://www.acmicpc.net/problem/10830" {
        val testCases = listOf(
            """
                2 5
                1 2
                3 4
            """.trimIndent() to """
                69 558
                337 406
            """.trimIndent(),
            """
                3 3
                1 2 3
                4 5 6
                7 8 9
            """.trimIndent() to """
                468 576 684
                62 305 548
                656 34 412
            """.trimIndent(),
            """
                5 10
                1 0 0 0 1
                1 0 0 0 1
                1 0 0 0 1
                1 0 0 0 1
                1 0 0 0 1
            """.trimIndent() to """
                512 0 0 0 512
                512 0 0 0 512
                512 0 0 0 512
                512 0 0 0 512
                512 0 0 0 512
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            val actual = No10830().solve(given.reader().buffered())
            actual shouldBe expected
        }
    }
})
