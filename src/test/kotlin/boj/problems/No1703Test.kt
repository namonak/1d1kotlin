package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1703Test : StringSpec({
    "생장점 : https://www.acmicpc.net/problem/1703" {
        val given = """
            1 3 0
            2 3 0 2 0
            3 3 0 2 0 2 0
            3 3 0 2 1 2 3
            2 4 1 3 4
            4 5 0 5 1 5 2 5 101
            0
        """.trimIndent()
        val expected = """
            3
            6
            12
            7
            5
            489
        """.trimIndent()

        No1703().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
