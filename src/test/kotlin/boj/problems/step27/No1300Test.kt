package boj.problems.step27

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1300Test : StringSpec({
    "K번째 수 : https://www.acmicpc.net/problem/1300" {
        val given = """
            3
            7
        """.trimIndent()
        val expected = "6"

        val actual = No1300().solve(BufferedReader(given.reader()))

        actual shouldBe expected
    }
})
