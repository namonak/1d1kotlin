package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2670Test : StringSpec({
    "연속부분최대곱 : https://www.acmicpc.net/problem/2670" {
        val given = """
            8
            1.1
            0.7
            1.3
            0.9
            1.4
            0.8
            0.7
            1.4
        """.trimIndent()
        val expected = "1.638"

        No2670().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
