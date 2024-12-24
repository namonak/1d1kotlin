package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1524Test : StringSpec({
    "세준세비 : https://www.acmicpc.net/problem/1524" {
        val given = """
            2

            1 1
            1
            1

            3 2
            1 3 2
            5 5
        """.trimIndent()
        val expected = """
            S
            B
        """.trimIndent()

        No1524().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
