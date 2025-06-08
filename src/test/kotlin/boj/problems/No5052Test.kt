package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5052Test : StringSpec({
    "전화번호 목록 : https://www.acmicpc.net/problem/5052" {
        val given = """
            2
            3
            911
            97625999
            91125426
            5
            113
            12340
            123440
            12345
            98346
        """.trimIndent()
        val expected = """
            NO
            YES
        """.trimIndent()

        val actual = No5052().solve(BufferedReader(given.reader()))
        actual shouldBe expected
    }
})
