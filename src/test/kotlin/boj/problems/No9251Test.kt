package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9251Test : StringSpec({
    "LCS : https://www.acmicpc.net/problem/9251" {
        val given = """
            ACAYKP
            CAPCAK
        """.trimIndent()
        val expected = "4"

        val result = No9251().solve(given.reader().buffered())
        result shouldBe expected
    }
})
