package boj.problems.step7

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No2563Test : StringSpec({
    "색종이 : https://www.acmicpc.net/problem/2563" {
        val given = """
            3
            3 7
            15 7
            5 2
        """.trimIndent()
        val expected = 260

        val actual = No2563.solve(BufferedReader(StringReader(given)))

        actual shouldBe expected
    }
})
