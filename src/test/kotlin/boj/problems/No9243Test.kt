package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No9243Test : StringSpec({
    "파일 완전 삭제 : https://www.acmicpc.net/problem/9243" {
        val testCases = listOf(
            """
                1
                10001110101000001111010100001110
                01110001010111110000101011110001
            """.trimIndent() to "Deletion succeeded",
            """
                20
                0001100011001010
                0001000011000100
            """.trimIndent() to "Deletion failed"
        )

        testCases.forEach { (given, expected) ->
            No9243().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
