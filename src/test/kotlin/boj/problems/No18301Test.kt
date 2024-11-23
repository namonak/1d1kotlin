package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No18301Test : StringSpec({
    "Rats : https://www.acmicpc.net/problem/18301" {
        val given = """
            15 18 11
        """.trimIndent()
        val expected = "24"

        No18301().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
