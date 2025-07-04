package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5357Test : StringSpec({
    "Dedupe : https://www.acmicpc.net/problem/5357" {
        val given = """
            3
            ABBBBAACC
            AAAAA
            ABC
        """.trimIndent()
        val expected = """
            ABAC
            A
            ABC
        """.trimIndent()

        val result = No5357().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})
