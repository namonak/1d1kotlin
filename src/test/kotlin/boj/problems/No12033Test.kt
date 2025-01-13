package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No12033Test : StringSpec({
    "김인천씨의 식료품가게 (Small) : https://www.acmicpc.net/problem/12033" {
        val given = """
            2
            3
            15 20 60 75 80 100
            4
            9 9 12 12 12 15 16 20
        """.trimIndent()
        val expected = """
            Case #1: 15 60 75
            Case #2: 9 9 12 15
        """.trimIndent()

        No12033().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
