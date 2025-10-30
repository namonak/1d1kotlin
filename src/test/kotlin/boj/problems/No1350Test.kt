package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1350Test : StringSpec({
    "진짜 공간 : https://www.acmicpc.net/problem/1350" {
        val testCases = listOf(
            """
                1
                600
                512
            """.trimIndent() to "1024",
            """
                5
                16 32 128 128 0
                32768
            """.trimIndent() to "131072",
            """
                3
                4096 33792 76800
                1024
            """.trimIndent() to "114688",
            """
                6
                0 0 0 0 0 0
                8
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No1350().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
