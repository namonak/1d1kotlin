package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20920Test : StringSpec({
    "영단어 암기는 괴로워 : https://www.acmicpc.net/problem/20920" {
        val testCases = listOf(
            """
                7 4
                apple
                ant
                sand
                apple
                append
                sand
                sand
            """.trimIndent()
                to """
                    sand
                    apple
                    append
                """.trimIndent(),
            """
                12 5
                appearance
                append
                attendance
                swim
                swift
                swift
                swift
                mouse
                wallet
                mouse
                ice
                age
            """.trimIndent()
                to """
                    swift
                    mouse
                    appearance
                    attendance
                    append
                    wallet
                """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No20920.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
