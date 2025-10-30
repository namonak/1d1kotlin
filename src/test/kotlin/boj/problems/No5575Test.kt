package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5575Test : StringSpec({
    "타임 카드 : https://www.acmicpc.net/problem/5575" {
        val given = """
            9 0 0 18 0 0
            9 0 1 18 0 0
            12 14 52 12 15 30
        """.trimIndent()
        val expected = """
            9 0 0
            8 59 59
            0 0 38
        """.trimIndent()

        No5575().solve(given.reader().buffered()) shouldBe expected
    }
})
