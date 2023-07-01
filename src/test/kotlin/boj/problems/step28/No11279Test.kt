package boj.problems.step28

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11279Test : StringSpec({
    "최대 힙 : https://www.acmicpc.net/problem/11279" {
        val given = """
            13
            0
            1
            2
            0
            0
            3
            2
            1
            0
            0
            0
            0
            0
        """.trimIndent()
        val expected = """
            0
            2
            1
            3
            2
            1
            0
            0
        """.trimIndent()

        val actual = No11279.solve(BufferedReader(given.reader()))

        actual shouldBe expected
    }
})
