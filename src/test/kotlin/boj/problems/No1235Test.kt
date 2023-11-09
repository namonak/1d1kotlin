package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1235Test : StringSpec({
    "학생 번호 : https://www.acmicpc.net/problem/1235" {
        val given = """
            3
            1212345
            1212356
            0033445
        """.trimIndent()
        val expected = "3"

        No1235.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
