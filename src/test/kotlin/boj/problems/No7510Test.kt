package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No7510Test : StringSpec({
    "고급 수학 : https://www.acmicpc.net/problem/7510" {
        val given = """
            2
            36 77 85
            40 55 69
        """.trimIndent()
        val expected = """
            Scenario #1:
            yes

            Scenario #2:
            no
        """.trimIndent()

        No7510().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
