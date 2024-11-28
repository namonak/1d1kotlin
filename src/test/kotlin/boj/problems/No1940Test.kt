package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1940Test : StringSpec({
    "주몽 : https://www.acmicpc.net/problem/1940" {
        val given = """
            6
            9
            2 7 4 1 5 3
        """.trimIndent()
        val expected = "2"

        No1940().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
