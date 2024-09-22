package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No4963Test : StringSpec({
    "섬의 개수 : https://www.acmicpc.net/problem/4963" {
        val given = """
            1 1
            0
            2 2
            0 1
            1 0
            3 2
            1 1 1
            1 1 1
            5 4
            1 0 1 0 0
            1 0 0 0 0
            1 0 1 0 1
            1 0 0 1 0
            5 4
            1 1 1 0 1
            1 0 1 0 1
            1 0 1 0 1
            1 0 1 1 1
            5 5
            1 0 1 0 1
            0 0 0 0 0
            1 0 1 0 1
            0 0 0 0 0
            1 0 1 0 1
            0 0
        """.trimIndent()
        val expected = """
            0
            1
            1
            3
            1
            9
        """.trimIndent()

        No4963().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
