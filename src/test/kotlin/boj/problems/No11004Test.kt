package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11004Test : StringSpec({
    "K번째 수 : https://www.acmicpc.net/problem/11004" {
        val given = """
            5 2
            4 1 2 3 5
        """.trimIndent()
        val expected = 2

        No11004.solve(BufferedReader(given.reader())) shouldBe expected
    }
})
