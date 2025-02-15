package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11134Test : StringSpec({
    "쿠키애호가 : https://www.acmicpc.net/problem/11134" {
        val given = """
            2
            6 2
            10 3
        """.trimIndent()
        val expected = """
            3
            4
        """.trimIndent()

        No11134().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
