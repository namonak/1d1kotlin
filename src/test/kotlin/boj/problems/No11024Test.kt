package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11024Test : StringSpec({
    "더하기 4 : https://www.acmicpc.net/problem/11024" {
        val given = """
            2
            1 2 3 4 5
            5 4 5 4 2 3 1 2
        """.trimIndent()
        val expected = """
            15
            26
        """.trimIndent()

        val result = No11024().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})
