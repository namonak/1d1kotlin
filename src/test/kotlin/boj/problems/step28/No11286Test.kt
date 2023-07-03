package boj.problems.step28

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11286Test : StringSpec({
    "절댓값 힙 : https://www.acmicpc.net/problem/11286" {
        val given = """
            18
            1
            -1
            0
            0
            0
            1
            1
            -1
            -1
            2
            -2
            0
            0
            0
            0
            0
            0
            0
        """.trimIndent()
        val expected = """
            -1
            1
            0
            -1
            -1
            1
            1
            -2
            2
            0
        """.trimIndent()

        val actual = No11286.solve(BufferedReader(given.reader()))

        actual shouldBe expected
    }
})
