package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11121Test : StringSpec({
    "Communication Channels : https://www.acmicpc.net/problem/11121" {
        val given = """
            2
            10 10
            10 11
        """.trimIndent()
        val expected = """
            OK
            ERROR
        """.trimIndent()

        val actual = No11121().solve(BufferedReader(given.reader()))
        actual shouldBe expected
    }
})
