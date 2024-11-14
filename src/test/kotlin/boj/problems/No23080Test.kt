package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No23080Test : StringSpec({
    "스키테일 암호 : https://www.acmicpc.net/problem/23080" {
        val given = """
            3
            iabucdpefcg
        """.trimIndent()
        val expected = "iupc"

        No23080().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
