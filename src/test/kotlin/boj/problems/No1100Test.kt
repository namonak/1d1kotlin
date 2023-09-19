package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1100Test : StringSpec({
    "하얀 칸 : https://www.acmicpc.net/problem/1100" {
        val testCases = listOf(
            """
                .F.F...F
                F...F.F.
                ...F.F.F
                F.F...F.
                .F...F..
                F...F.F.
                .F.F.F.F
                ..FF..F.
            """.trimIndent()
                to 1,
            """
                ........
                ........
                ........
                ........
                ........
                ........
                ........
                ........
            """.trimIndent()
                to 0,
            """
                FFFFFFFF
                FFFFFFFF
                FFFFFFFF
                FFFFFFFF
                FFFFFFFF
                FFFFFFFF
                FFFFFFFF
                FFFFFFFF
            """.trimIndent()
                to 32,
            """
                ........
                ..F.....
                .....F..
                .....F..
                ........
                ........
                .......F
                .F......
            """.trimIndent()
                to 2
        )

        testCases.forEach { (given, expected) ->
            No1100.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
