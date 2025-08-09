package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2476Test : StringSpec({
    "주사위 게임 : https://www.acmicpc.net/problem/2476" {
        val given = """
            3
            3 3 6
            2 2 2
            6 2 5
        """.trimIndent()
        val expected = "12000"

        val result = No2476().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})
