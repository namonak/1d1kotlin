package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1300Test : StringSpec({
    "K번째 수 : https://www.acmicpc.net/problem/1300" {
        val given = """
            3
            7
        """.trimIndent()
        val expected = "6"

        No1300().solve(given.reader().buffered()) shouldBe expected
    }
})
