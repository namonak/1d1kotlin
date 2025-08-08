package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2975Test : StringSpec({
    "Transactions : https://www.acmicpc.net/problem/2975" {
        val given = """
            10000 W 10
            -200 D 300
            50 W 300
            0 W 0
        """.trimIndent()
        val expected = """
            9990
            100
            Not allowed
        """.trimIndent()

        val result = No2975().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})
